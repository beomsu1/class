package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("LogoutController... doGet()...");
		
		// 현재 세션을 받아서 invalidate() - 삭제

		request.getSession().invalidate();
		
		System.out.println("로그아웃 되었습니다.");
		
		response.sendRedirect("/app/index.jsp");
	}

}
