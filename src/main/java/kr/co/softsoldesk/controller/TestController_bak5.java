package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
@SessionAttributes({ "sessionBean1", "sessionBean2" })
public class TestController_bak5 {
	/*
	 * //HttpServletRequest에서 Session 접근
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
	 * //request를 이용해서 session 영역 확보 HttpSession session = request.getSession();
	 * session.setAttribute("data1", "data1");
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * //request를 이용해서 session 영역 확보 HttpSession session = request.getSession();
	 * String data1 = (String)session.getAttribute("data1");
	 * System.out.println("data1 : " + data1);
	 * 
	 * return "result1"; }
	 * 
	 * 
	 * //Session 영역으로 직접 접근
	 * 
	 * @GetMapping("/test1") public String test1(HttpSession session) {
	 * session.setAttribute("data1", "JAVA"); return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(HttpSession session) { String
	 * data1 = (String)session.getAttribute("data1");
	 * 
	 * System.out.println("data1 : " + data1);
	 * 
	 * return "result1"; }
	 * //=====================================================================
	 * //HttpSession에서는 브라우저만 유지되면 값이 저장됨
	 * 
	 * @GetMapping("/test2") public String test2(HttpSession session) {
	 * session.setAttribute("data1", "JSP"); return "redirect:/result1"; }
	 * 
	 * @GetMapping("/test3") public String test3(HttpSession session) {
	 * session.setAttribute("data1", "Spring"); return "forward:/result1"; }
	 * //===========================================================================
	 * ==========================
	 * 
	 * @GetMapping("/test4") public String test4(HttpSession session) { DataBean1
	 * bean1 = new DataBean1(); bean1.setData1("python"); bean1.setData2("bigdata");
	 * // session 영역에 저장 session.setAttribute("bean1", bean1);
	 * 
	 * return "test4"; }
	 * 
	 * @GetMapping("/result2") public String result2(HttpSession session) {
	 * //session 영역에 들어가서 객체 가져옴 DataBean1 bean1 =
	 * (DataBean1)session.getAttribute("bean1"); System.out.println("bean1.data1 : "
	 * + bean1.getData1()); System.out.println("bean1.data2 : " + bean1.getData2());
	 * 
	 * return "result2"; }
	 * 
	 * //===========================================================================
	 * ==========================
	 * 
	 * @ModelAttribute("sessionBean1") // 메서드를 찾아서 빈 객체 생성 public DataBean1
	 * sessionBean1() {
	 * 
	 * return new DataBean1(); }
	 * 
	 * @ModelAttribute("sessionBean2") public DataBean1 sessionBean2() {
	 * 
	 * return new DataBean1(); }
	 * 
	 * @GetMapping("/test5") public String test5(@ModelAttribute("sessionBean1")
	 * DataBean1 sessionBean1,
	 * 
	 * @ModelAttribute("sessionBean2") DataBean1 sessionBean2) {
	 * 
	 * sessionBean1.setData1("문자열6"); sessionBean1.setData2("문자열7");
	 * //============================= sessionBean2.setData1("문자열8");
	 * sessionBean2.setData2("문자열9");
	 * 
	 * return "test5"; }
	 * 
	 * @GetMapping("/result3") public String result3(@ModelAttribute("sessionBean1")
	 * DataBean1 sessionBean1,
	 * 
	 * @ModelAttribute("sessionBean2") DataBean1 sessionBean2) {
	 * 
	 * System.out.println("sessionBean1.data1 : " + sessionBean1.getData1());
	 * System.out.println("sessionBean1.data2 : " + sessionBean1.getData2());
	 * System.out.println("sessionBean2.data1 : " + sessionBean2.getData1());
	 * System.out.println("sessionBean2.data2 : " + sessionBean2.getData2());
	 * 
	 * return "result3"; }
	 */
}
