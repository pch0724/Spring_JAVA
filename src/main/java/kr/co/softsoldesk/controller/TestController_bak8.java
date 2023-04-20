package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController_bak8 {
	/*
	 * @Autowired DataBean1 applicationBean1;
	 * 
	 * @Resource(name = "applicationBean2") DataBean2 applicationBean2;
	 * 
	 * @Autowired DataBean3 applicationBean3;
	 * 
	 * @Resource(name = "applicationBean4") DataBean4 applicationBean4;
	 * 
	 * @GetMapping("/test1") public String test1() {
	 * applicationBean1.setData1("Java"); applicationBean1.setData2("Html/css");
	 * 
	 * applicationBean2.setData3("JSP"); applicationBean2.setData4("Spring");
	 * 
	 * applicationBean3.setData5("개"); applicationBean3.setData6("박");
	 * 
	 * applicationBean4.setData7("ㅁ"); applicationBean4.setData8("ㄴ");
	 * 
	 * 
	 * return "test1"; }
	 * 
	 * @GetMapping("/result1") public String result1(Model model) {
	 * 
	 * System.out.println(applicationBean1.getData1());
	 * System.out.println(applicationBean1.getData2());
	 * 
	 * System.out.println(applicationBean2.getData3());
	 * System.out.println(applicationBean2.getData4());
	 * 
	 * System.out.println(applicationBean3.getData5());
	 * System.out.println(applicationBean3.getData6());
	 * 
	 * System.out.println(applicationBean4.getData7());
	 * System.out.println(applicationBean4.getData8());
	 * 
	 * model.addAttribute("applicationBean1", applicationBean1);
	 * model.addAttribute("applicationBean2", applicationBean2);
	 * model.addAttribute("applicationBean3", applicationBean3);
	 * model.addAttribute("applicationBean4", applicationBean4);
	 * 
	 * return "result1"; }
	 */
}
