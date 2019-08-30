package com.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.form.booking;
import com.form.bookingjdbc;  
@Controller  
public class controller { 
	@Autowired
	bookingjdbc jc;
@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }     
@RequestMapping("/bookingform")
	public String bookingform(Model m)
	{
		booking b=new booking();
		m.addAttribute("booking",b);
		return "bookingform";
	}
@RequestMapping("/submitform")
	public String submitform(@ModelAttribute("booking")booking b)
	{
		jc.save(b);
		return "redirect:/viewbook";
	}
@RequestMapping("/viewbook")
	public String viewbook(Model m)
	{
		List<booking> list=jc.getbooking();
		m.addAttribute("list",list);
		return "viewbook";
	}
}  