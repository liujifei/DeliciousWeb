package com.delicious.service;

import org.springframework.stereotype.Component;

import com.delicious.model.User;

@Component
public interface SignInService {
	public void signIn(User user);
}
