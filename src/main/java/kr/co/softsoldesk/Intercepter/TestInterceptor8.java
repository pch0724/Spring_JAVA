package kr.co.softsoldesk.Intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor8 implements HandlerInterceptor {
	
	// preHandle 자동 실행 -> return false : 요청 처리에 대한 진행 중단
	// Controller의 메서드 호출되기 전에 수행
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TestInterceptor8 - preHandle");
		
		// return false; : 수행 중단
		return true; //HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	
	// Controller의 메서드 호출된 후에 수행
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("TestInterceptor8 - postHandle");
		
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	// View 처리까지 완료되면 호출됨
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("TestInterceptor8 - afterCompletion");
		
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	
}
