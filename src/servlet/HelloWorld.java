package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HelloWorld() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {

			System.out.println("BEGIN Helloworld!"+ getCurrentTime());

			request.setAttribute("message","HelloWorld!");
			//		request.setAttribute("message",getCurrentTime());

			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/HelloWorld.jsp");

			dispatcher.forward(request,response);

		}finally {
			System.out.println("END");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private String getCurrentTime() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}

}
