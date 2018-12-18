package servlet;

//Stocktradeではここを実施する。

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.StockTradeAnalysisSystem;

@WebServlet("/ShowMenu")
public class ShowMenu extends StockTradeAnalysisSystem{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		dispatcherForward(URL_fwd01,Title01,request, response);
	}

}
