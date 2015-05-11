package com.delicious.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.delicious.model.User;
import com.delicious.service.SignInService;

@Controller
@RequestMapping("/signin")
public class SignInController {
	  private SignInService signInService;
	  @RequestMapping(params = "method=signin")
	  public String signin(User user){
	    System.out.println("email:"+user.getEmail());
	    System.out.println("paswd:"+user.getPassword());
	    signInService.signIn(user);
	    return "success";
	  }
	  public SignInService getSignInService() {
	    return signInService;
	  }
	  @Resource
	  public void setSignInService(SignInService signInService) {
	    this.signInService = signInService;
	  }

}
