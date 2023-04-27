package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth/login") 
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		///////////////////////////////////
		// 사용자 요청 처리
		
		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String passward = request.getParameter("passward");
		System.out.println("사용자 입력 pw : " + passward);
		
		///////////////////////////////////
		// 응답
		
		PrintWriter out = response.getWriter();
		out.println("id : " + userid);
		out.println("pw : " + passward);
		out.close();
	}

	protected void doPost(
			HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		///////////////////////////////////
		// 사용자 요청 처리
		
		String userid = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userid);
		
		String passward = request.getParameter("passward");
		System.out.println("사용자 입력 pw : " + passward);
		
		///////////////////////////////////
		// 응답
		
		PrintWriter out = response.getWriter();
		out.println("id : " + userid);
		out.println("pw : " + passward);
		out.close();
		
	}

}