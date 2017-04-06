package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(path="/login.do" ,method=RequestMethod.GET)
	public String getLoginPage(){
		return "Login";
	}
	@RequestMapping(path="/login.do" ,method=RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("userName") String name,@RequestParam("password") String password){
		ModelAndView mv = new ModelAndView();
	      if(name.equals(password)){
	    	  mv.addObject("user",name);
	    	  mv.setViewName("Welcome");
	    	  return mv;
	      }else{
	    	  mv.setViewName("Failure");
	    	  return mv;
	      }
	}

}
