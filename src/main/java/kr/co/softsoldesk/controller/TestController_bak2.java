package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController_bak2 {

	/*
	 * // 요청이 발생되면 주소를 분석해서(dispatcher) 매핑이 일치하는 메서드가 호출
	 * 
	 * @GetMapping("/test1") public String test1() {
	 * 
	 * // 응답 결과에서 또 다른 요청이 반환됨 // sub1을 새롭게 요청(주소창의 주소도 변경) return "redirect:/sub1";
	 * }
	 * 
	 * //sub1 정보 요청을 수행하기 위해 주소 분석하여 일치하는 메서드 호출
	 * 
	 * @GetMapping("/sub1") public String sub1() {
	 * 
	 * return "/sub1"; }
	 * 
	 * //======================================================= //test2
	 * 
	 * @GetMapping("/test2") public String test2() {
	 * 
	 * // forward : 서버에서의 이동 // 서버에서의 이동은 브라우저에서 알 수가 없으므로 주소 변경 안됨 return
	 * "forward:/sub2"; }
	 * 
	 * @GetMapping("/sub2") public String sub2() {
	 * 
	 * return "sub2"; }
	 */
	
}
