package com.hoangphuc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hoangphuc.entity.NhanVien;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@GetMapping
	public String Default() {
		return "trangchu";
	}
	
	@GetMapping("/{hoten}")
	public String NhanThamSo(@PathVariable String hoten, ModelMap modelMap) {
		modelMap.addAttribute("hoten", hoten);
		return "trangchu";
		
	}
	
}
