package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.service.TodoDeleteService;

@WebServlet("/todo/delete")
public class TodoDeleteController extends HttpServlet {
	
	TodoDeleteService deleteService;
	
	public TodoDeleteController(){
		this.deleteService = TodoDeleteService.getInstance();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("TodoDeleteController... doPost()...");
		
		// 회원의 로그인 여부를 확인 후 비로그인 상태 -> 로그인 페이지로 이동
		HttpSession session = request.getSession();
		
		// 판단하는 조건 session이 새로만들어진 세션 X , 세션에 로그인 정보 O -> 로그인 상태
		// 리다이렉트 -> 로그인 페이지
		// 새로만들어진 세션이거나 세션에 로그인 정보가 없다면 리다이렉트
		if(session.isNew() || session.getAttribute("loginInfo") == null) {
			
			System.out.println("로그인 상태가 아닙니다.");
			
			// 로그인 페이지로 이동
			response.sendRedirect("/app/login");
			
			return;
		}
		
		// 사용자로부터 no 받기
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		
		// 서비스로 no 전달 -> 삭제 처리
		int result = deleteService.delete(no);
		
		// 결과
		if(result >0) {
			System.out.println(no + "번 할 일이 삭제되었습니다.");
		}else {
			System.out.println("삭제 실패");
		}
		
		// redirect( list )
		response.sendRedirect("list");
	}

}
