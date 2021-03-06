package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
@MultipartConfig(location="/tmp", maxFileSize=1048576)
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	final String screen_name = "st02_upld";

	public UploadServlet() {}

	public void doGet(HttpServletRequest request,
    		HttpServletResponse response)
    		throws ServletException, IOException {

		RequestDispatcher dispatcher	=
				request.getRequestDispatcher("/WEB-INF" + "/jsp" + "/" + screen_name + ".jsp");
		dispatcher.forward(request,response);

	}

    //
	@Override
    protected void doPost(HttpServletRequest request,
    		HttpServletResponse response)
    		throws ServletException, IOException {

    	   Part part = request.getPart("file");
           String name = this.getFileName(part);
           part.write(getServletContext().getRealPath("/WEB-INF/uploaded") + "/" + name);
           response.sendRedirect("jsp/upload.jsp");

	}

	//
    private String getFileName(Part part) {
        String name = null;
        for (String dispotion : part.getHeader("Content-Disposition").split(";")) {
            if (dispotion.trim().startsWith("filename")) {
                name = dispotion.substring(dispotion.indexOf("=") + 1).replace("\"", "").trim();
                name = name.substring(name.lastIndexOf("\\") + 1);
                break;
            }
        }
        return name;
    }

}
