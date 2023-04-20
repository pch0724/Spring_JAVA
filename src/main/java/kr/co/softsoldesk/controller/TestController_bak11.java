package kr.co.softsoldesk.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController_bak11 {
	/*
	 * @Autowired ReloadableResourceBundleMessageSource res;
	 * 
	 * //=========================================================================
	 * 
	 * @GetMapping("/test1") public String test1(Model model, Locale locale) {
	 * String a1 = res.getMessage("aaa.a1", null, null); String b1 =
	 * res.getMessage("bbb.b1", null, null);
	 * 
	 * //크롬 자체에서 등록되어 있는 언어코드 불러옴 //크롬 자체에서 Reloadable 등록 String a3 =
	 * res.getMessage("aaa.a3", null, locale);
	 * 
	 * 
	 * //{}부분에 세팅할 값 Object[] args = {30,"김민주"}; String a2 =
	 * res.getMessage("aaa.a2", args, null);
	 * 
	 * 
	 * System.out.println("aaa.a1 : " + a1); System.out.println("bbb.b1 : " + b1);
	 * 
	 * System.out.println("aaa.a2 : " + a2); //다국어 처리 System.out.println("locale : "
	 * + locale);
	 * 
	 * model.addAttribute("args", args); //jsp
	 * 
	 * return "test1"; }
	 */
}