package com.hoangphuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {

	@GetMapping
	public String Deafult() {
		
		return "dangnhap";
	}
	
	@PostMapping
	public String XulyDangNhap(@RequestParam String tendangnhap, @RequestParam String matkhau){
		if(tendangnhap.equals("abc") && matkhau.equals("123")) {
			return "redirect:/";
		}else {
			return "dangnhap";
		}
	}

}
