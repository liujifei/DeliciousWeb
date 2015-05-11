package com.delicious.dao;

import org.springframework.stereotype.Component;

import com.delicious.model.User;

@Component
public class SignInDao {
	  //模拟数据库操作
	  public void signIn(User user){
	    System.out.print("Add");
	  }

}
