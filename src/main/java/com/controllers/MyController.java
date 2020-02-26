package com.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.dao.StudentDao;
import com.cts.model.StudentBean;

@Controller
public class MyController {

	
	@Autowired
	StudentDao dao;
	
	//@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/")
	public String formLauncher(@ModelAttribute("student")StudentBean s) {
		
		
		return "formpage";
		
	}
	
	
	@PostMapping("/register")
	public String registerStudent(StudentBean std) {
		
		dao.save(std);
		
		return "sucess";
	}
	
	
	@GetMapping("/getStudentDetails")
	public String getStudent(Model m) {
		
		
	Optional<StudentBean> opt=dao.findById(10);
		
	if(opt.isPresent()) {
		
		StudentBean s=opt.get();
		
		m.addAttribute("data", s);
		
	}
	
		
		return "sucess";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

