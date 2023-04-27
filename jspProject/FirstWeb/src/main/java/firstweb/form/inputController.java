package firstweb.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

/**
 * Servlet implementation class inputController
 */
@WebServlet("/input")
public class inputController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inputController....");
		
		request.setAttribute("title", "계산기");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/input.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String num1 = req.getParameter("num1");
	String num2 = req.getParameter("num2");
	
	PrintWriter out = resp.getWriter();
	
	out.println(num1);
	out.println(num2);
	out.close();
	
	}

	
	
	
}
