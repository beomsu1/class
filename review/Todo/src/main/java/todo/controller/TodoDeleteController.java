package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.proxy.annotation.Post;

/**
 * Servlet implementation class TodoDeleteController
 */
@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoDeleteController...doPost()...");
		
		// no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// 서비스로 no를 보내서 삭제
		
		
		// 결과
		
		response.sendRedirect("list");
	}

}
