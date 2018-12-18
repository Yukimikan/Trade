package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.StockTradeAnalysisSystem;
import form.LoginForm;

@WebServlet("/Login")
public class Login extends StockTradeAnalysisSystem {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		LoginForm form_in = new LoginForm();
		dispatcherForward(URL_fwd00,Title00,request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		LoginForm form_in = new LoginForm();

		dispatcherForward(URL_fwd01,Title01,request, response);
	}

}
