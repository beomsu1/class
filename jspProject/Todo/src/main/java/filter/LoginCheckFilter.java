package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/todo/*")
public class LoginCheckFilter extends HttpFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// 요청에 대한 filter 처리
		System.out.println("LoginCheckFilter... doFilter()...");

		// 회원의 로그인 여부를 확인 후 비로그인 상태 -> 로그인 페이지로 이동
		HttpSession session = ((HttpServletRequest)request).getSession();

		// 판단하는 조건 session이 새로만들어진 세션 X , 세션에 로그인 정보 O -> 로그인 상태
		// 리다이렉트 -> 로그인 페이지
		// 새로만들어진 세션이거나 세션에 로그인 정보가 없다면 리다이렉트
		if (session.isNew() || session.getAttribute("loginInfo") == null) {

			System.out.println("로그인 상태가 아닙니다.");

			// 로그인 페이지로 이동
			((HttpServletResponse)response).sendRedirect("/app/login"); // 형변환을 시켜줘야함.

			return;
		}

		chain.doFilter(request, response);

		// 응답에 대한 filter 처리

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
