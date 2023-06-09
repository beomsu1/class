package todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.Todo;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoModifyController... doGet()...");
		
		// no 값을 받고
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고
		
		Todo todo = new Todo(no, "청소", "2023-05-04", "done");
		
		// request 속성에 결과 데이터를 저장
		request.setAttribute("todo", todo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/todo/modify.jsp");
		dispatcher.forward(request, response);
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("ModifyController...doPost()...");
		
		//요청받을 떄 한글로 받을 수 있게
		request.setCharacterEncoding("utf-8");
		
		String noStr = request.getParameter("no");
		String todo = request.getParameter("todo");
		String duedate = request.getParameter("duedate");
		String complete = request.getParameter("complete");
		
		Todo newTodo = new Todo(Integer.parseInt(noStr), todo, duedate, complete);
		
		System.out.println(newTodo);
		
		// 서비스에 요청 : update
		
		// 결과 받고
		
		// redirect 처리
		response.sendRedirect("list");
		
	}

}
