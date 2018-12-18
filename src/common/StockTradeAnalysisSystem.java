package common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class StockTradeAnalysisSystem extends HttpServlet
	implements URLmapping{

	//dispatcherをフォワードする。
	protected void dispatcherForward(String urlfwd,
			String screentitle,
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		//フォワード後の画面タイトルの設定
		request.setAttribute("screentitle", screentitle);

		//画面の切り替えを行う
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(urlfwd);
		dispatcher.forward(request, response);
	}

}
