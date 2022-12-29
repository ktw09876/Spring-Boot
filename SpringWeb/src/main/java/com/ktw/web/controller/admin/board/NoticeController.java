package com.ktw.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@RequestMapping("list") // list,detail,edit,reg,del
	public String list() {
		
		return "admin/board/notice/list";
	}
	
	@RequestMapping("detail") // list,detail,edit,reg,del
	public String detail() {
		
		return "admin/board/notice/detail";
	}
	
	@RequestMapping("reg") // list,detail,edit,reg,del
	public String reg() {
		
		return "admin/board/notice/reg";
	}
}
