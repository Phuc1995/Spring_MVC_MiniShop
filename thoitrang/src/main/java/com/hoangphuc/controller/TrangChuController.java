package com.hoangphuc.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

	@Autowired
	SessionFactory sessionFactory;


	@GetMapping
	@Transactional
	public String Default() {
		Session session = sessionFactory.getCurrentSession();
		String sql = "select * from nhanvien";
		List<NhanVien> list = session.createQuery(sql).getResultList();
		for (NhanVien nv : list){

			System.out.print(nv.getTenNhanVien()+"");
			System.out.print("aaaaaa");
		}
		return "trangchu";
	}
	

	
}
