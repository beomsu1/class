package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todo/register")
public class TodoRegisterController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/register.jsp");
		dispatcher.forward(request, response);
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoRegisterController...doPost()...");
		
		// post 방식의 데이터 전달 => 파라미터 한글처리
		request.setCharacterEncoding("utf-8");
		
		// 입력폼에서 전달한 데이터를 받아서 처리
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		
		System.out.println(todo + " : " + duedate);
		
		response.sendRedirect("list");
		
	}

}
