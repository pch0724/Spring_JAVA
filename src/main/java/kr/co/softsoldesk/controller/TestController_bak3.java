package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController_bak3 {
	/*
	 * 
	 * // 요청이 발생되면 주소를 분석해서(dispatcher) 매핑이 일치하는 메서드가 호출
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
	 * 
	 * request.setAttribute("data1", "JAVA");
	 * 
	 * // redirect를 통해 기존 데이터들 초기화됨 return "redirect:/result1"; // 새로운 요청정보가 발생되므로
	 * request 소멸 => null
	 * 
	 * }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * // redirect시 request의 객체가 소멸됨(초기화됨) => data = null String str1 =
	 * (String)request.getAttribute("data1"); System.out.println("str1 : " + str1);
	 * 
	 * return "result1"; }
	 * 
	 * // 요청이 발생되면 주소를 분석해서(dispatcher) 매핑이 일치하는 메서드가 호출
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
	 * 
	 * request.setAttribute("data1", "JAVA");
	 * 
	 * // forward : return "forward:/result1"; //
	 * 
	 * }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * // String str1 = (String) request.getAttribute("data1");
	 * System.out.println("str1 : " + str1);
	 * 
	 * return "result1"; }
	 * 
	 * //
	 * =============================================================================
	 * =========== // test2
	 * 
	 * @GetMapping("/test2") public String test2(Model model) {
	 * 
	 * model.addAttribute("data2", "Spring");
	 * 
	 * return "forward:/result2";
	 * 
	 * }
	 * 
	 * // 매개변수로 model 사용 시 model은 새로운 model은 기존 model의 setattribute 해놓은 값을 전달받지 못함
	 * => HttpServletRequest를 통해 값을 받아와야함
	 * 
	 * @GetMapping("/result2") public String result2(HttpServletRequest request) {
	 * 
	 * String data2 = (String) request.getAttribute("data2");
	 * System.out.println("data2 : " + data2);
	 * 
	 * return "result2"; }
	 * 
	 * model 받아서 사용시 새로운 model 요청 정보로 취급하므로 null 처리됨
	 * 
	 * @GetMapping("/result2") public String result2(Model model) {
	 * 
	 * String data2 = (String)model.getAttribute("data2");
	 * System.out.println("data2 : " + data2);
	 * 
	 * return "result2"; }
	 * 
	 * //
	 * =============================================================================
	 * =========== // test3
	 * 
	 * @GetMapping("/test3") public ModelAndView test3(ModelAndView mv) {
	 * mv.addObject("data3", "JSP"); mv.setViewName("forward:/result3");
	 * 
	 * return mv; }
	 * 
	 * @GetMapping("/result3") public String result3(HttpServletRequest request) {
	 * 
	 * String data3 = (String) request.getAttribute("data3");
	 * System.out.println("data3 : " + data3);
	 * 
	 * return "result3"; }
	 * 
	 * //
	 * =============================================================================
	 * =========== // test4
	 * 
	 * @GetMapping("/test4") public String test4(Model model) { DataBean1 bean1 =
	 * new DataBean1(); bean1.setData1("HTML/CSS"); bean1.setData2("JavaScript");
	 * 
	 * model.addAttribute("bean1", bean1);
	 * 
	 * return "forward:/result4"; // request 영역에 data 유지되면서 처리됨 }
	 * 
	 * @GetMapping("/result4") public String result4(HttpServletRequest request) {
	 * 
	 * DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
	 * System.out.println("data1 : " + bean1.getData1());
	 * System.out.println("data2 : " + bean1.getData2());
	 * 
	 * return "result4"; }
	 * 
	 * //
	 * =============================================================================
	 * =========== // test5
	 * 
	 * @GetMapping("/test5") public String test5(@ModelAttribute("bean1")DataBean1
	 * bean1) { bean1.setData1("python"); bean1.setData2("bigdata");
	 * 
	 * return "forward:/result5"; // request 영역에 data 유지되면서 처리됨 }
	 * 
	 * @GetMapping("/result5") public String result5(HttpServletRequest request) {
	 * 
	 * DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
	 * System.out.println("data1 : " + bean1.getData1());
	 * System.out.println("data2 : " + bean1.getData2());
	 * 
	 * return "result5"; }
	 */

}
