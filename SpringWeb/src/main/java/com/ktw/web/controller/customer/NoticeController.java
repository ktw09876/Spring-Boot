package com.ktw.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	@RequestMapping("list") // list,detail,edit,reg,del ... ~ request보다는 get을 사용
	public String list(Model model) {
		
		model.addAttribute("test", "Hello~ Devtools"); // test에다가 Hello라고 끼우겠다
		
		return "/WEB-INF/view/customer/notice/list.jsp"; //홈부터 경로를 써준다
	}
	
	@RequestMapping("detail") // list,detail,edit,reg,del
	public String detail() {
		
		return "customer/notice/detail";
	}
}
