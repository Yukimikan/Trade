package model;

import java.util.ArrayList;

/*
 * 1.株取引履歴のCSVファイルを読み込む。
 * 2.読み込んだ値を編集する。
 * 3.編集済みの値をリストにセットする。
 */

public class GetStockTradeLCSVResult{


	public ArrayList<StockTradeFile> list_trade;

	public ArrayList<StockTradeFile> execute(ArrayList<String> list){

		list_trade = new ArrayList<>();
		//1.株取引履歴のCSVファイルを読み込む。
		for (String line:list) {

			StockTradeFile stockTradefile = new StockTradeFile();

			//2.読み込んだ値を編集する。
			StockTradeFile stockTradefile_data =	stockTradefile.setParam(line);

			//3.編集済みの値をリストにセットする。
			list_trade.add(stockTradefile_data);
		}
		return list_trade;
	}

}
