package com.delicious.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.delicious.dao.SignInDao;
import com.delicious.model.User;
import com.delicious.service.SignInService;

@Component
public class SignInServiceImpl implements SignInService {
	  private SignInDao signInDao;

	  public SignInDao getSignInDao() {
	    return signInDao;
	  }

	  @Resource
	  public void setSignInDao(SignInDao signInDao) {
	    this.signInDao = signInDao;
	  }
	  
	  public void signIn(User user){
	    signInDao.signIn(user);
	  }

}
