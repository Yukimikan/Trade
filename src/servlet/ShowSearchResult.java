package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.StockTradeAnalysisSystem;
import form.SearchInputForm;
import form.SearchResultForm;
import model.FileControl;
import model.GetStockTradeLCSVResult;
import model.StockTradeFile;

@WebServlet("/ShowSearchResult")
public class ShowSearchResult extends StockTradeAnalysisSystem{

	final static String CSV拡張子 = ".csv";
	final static int HEADER_CSV  = 2;
	final static int CSV_MAXROW = 10;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		SearchInputForm form_in = new SearchInputForm();
		ArrayList<SearchResultForm> form_out =
				new ArrayList<>();

		String filename = "20160101" + "-" + "20180701" + CSV拡張子;
		String filepath = Workpath + "\\" + filename;
		ArrayList<String> list = new ArrayList<>();

		//formにセット
		String brand_code = request.getParameter(SearchInputForm.PRM_brandcode);

		//処理部の戻り値の型にそろえる
		ArrayList<StockTradeFile> stockTradeFilerec =
				new ArrayList<>();
		GetStockTradeLCSVResult stocktradelogic =
				new GetStockTradeLCSVResult();

		//ファイルデータを読み込み、無い場合はエラーとする。
		try {
			list = FileControl.readCSVdata(filepath,HEADER_CSV + 1, CSV_MAXROW);
		}catch(IOException e) {
			System.out.println("ファイルがない");
			//画面フォワード
			dispatcherForward(URL_fwd02,Title02,request, response);
		}

		//業務処理実行
		stockTradeFilerec = stocktradelogic.execute(list);

		ArrayList<String> cntr_date_lst=new ArrayList<>();
		ArrayList<String> brandname_lst=new ArrayList<>();

		for(StockTradeFile s : stockTradeFilerec) {

			SearchResultForm form2 = new SearchResultForm();

			form2.setCntr_date(s.getR1_contract_date());
			form2.setBrandname(s.getR7_brand_name());

			form_out.add(form2);

			cntr_date_lst.add(s.getR1_contract_date());
			brandname_lst.add(s.getR7_brand_name());
		}

		request.setAttribute(SearchInputForm.PRM_brandcode, brand_code);
		request.setAttribute("SearchResultForm",form_out);
		request.setAttribute(SearchResultForm.PRM_brandname_lst,brandname_lst);
		request.setAttribute(SearchResultForm.PRM_cntr_date_lst,cntr_date_lst);

		dispatcherForward(URL_fwd03, Title3, request, response);

	}

}
