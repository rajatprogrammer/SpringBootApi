package com.rajat.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rajat.app.ws.shared.dto.userDto;

public interface userService extends UserDetailsService{
	userDto createUser(userDto user);
	userDto getUserByUserId(String userId);
}