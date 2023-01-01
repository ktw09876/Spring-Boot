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
		
		model.addAttribute("test", "Hello~ Devtool"); // test에다가 Hello라고 끼우겠다
		
//		return "customer/notice/list"; //홈부터 경로를 써준다, ResourceViewResolver에게 이 페이지를 찾아달라
		return "customer.notice.list"; //홈부터 경로를 써준다, TilesViewResolver에게 이 페이지를 찾아달라
	}
	
	@RequestMapping("detail") // list,detail,edit,reg,del
	public String detail() {
		
		return "customer/notice/detail";
	}
	
}
