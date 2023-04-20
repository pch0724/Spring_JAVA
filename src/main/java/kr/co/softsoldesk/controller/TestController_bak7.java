package kr.co.softsoldesk.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController_bak7 {
	/*
	 * // HttpServletRequest를 활용하여 Application 사용
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) { //
	 * application 영역 확보하여 저장 ServletContext application =
	 * request.getServletContext(); // getServletContext : context 자체가 server이며,
	 * server = application임 application.setAttribute("data1", "Java");
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * ServletContext application = request.getServletContext(); String data1 =
	 * (String)application.getAttribute("data1");
	 * 
	 * System.out.println("data1 : " + data1);
	 * 
	 * return "result1"; }
	 * 
	 * //Application은 세션과 달리 HttpServletRequest를 통해서만 가능
	 * 
	 * @GetMapping("/test2") public String test2(ServletContext application) {
	 * 
	 * application.setAttribute("data1", "Java");
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result2") public String result2(ServletContext application) {
	 * String data1 = (String)application.getAttribute("data1");
	 * 
	 * System.out.println("data1 : " + data1);
	 * 
	 * return "result2"; }
	 * 
	 * //===========================================================================
	 * =================================== // Application 타입으로 주입
	 * 
	 * @Autowired ServletContext application;
	 * 
	 * 
	 * // ServletContext @Autowired 사용
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
	 * application.setAttribute("data1", "java");
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * String data1 = (String)application.getAttribute("data1");
	 * System.out.println("data1 : " + data1); return "result1"; }
	 * 
	 * //===========================================================================
	 * =================================== // DataBean1
	 * 
	 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
	 * DataBean1 bean1 = new DataBean1(); bean1.setData1("Java");
	 * bean1.setData2("HTML/CSS");
	 * 
	 * application.setAttribute("bean1", bean1);
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(HttpServletRequest request) {
	 * DataBean1 bean1 = (DataBean1)application.getAttribute("bean1");
	 * 
	 * String data1 = bean1.getData1(); String data2 = bean1.getData2();
	 * 
	 * System.out.println("bean1.data1 : " + data1);
	 * System.out.println("bean1.data2 : " + data2); return "result1"; }
	 */

}
