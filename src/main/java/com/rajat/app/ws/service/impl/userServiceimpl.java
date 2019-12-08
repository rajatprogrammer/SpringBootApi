package com.rajat.app.ws.service.impl;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rajat.app.ws.repository.userReposiotry;
import com.rajat.app.ws.io.entity.userEntity;
import com.rajat.app.ws.service.userService;
import com.rajat.app.ws.shared.dto.userDto;
import com.rajat.app.ws.shared.utils.utils;

@Service
public class userServiceimpl implements userService {
	
	@Autowired
	userReposiotry repository;
	@Autowired
	utils utilsvalue;
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	@Override
	public userDto createUser(userDto userData) {
		// TODO Auto-generated method stub
		if(repository.findByEmail(userData.getEmail())!=null) {
			throw new RuntimeException("Record Already Exists");
		}
		userEntity userEntity = new userEntity();
		BeanUtils.copyProperties(userData, userEntity);
		userEntity.setEncryptedPassword(bcryptPasswordEncoder.encode(userData.getPassword()));
		userEntity.setUserId(utilsvalue.generateUserId(30));
		userEntity storedUserDetail=repository.save(userEntity);
		userDto returnValue = new userDto();
		BeanUtils.copyProperties(storedUserDetail, returnValue);	
		return returnValue ;
	}
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		userEntity user=repository.findByEmail(email);
		if(user==null)
		throw new UsernameNotFoundException("username does not exist", new Error("userName not exist"));
		return new User(user.getEmail(),user.getEncryptedPassword(),new ArrayList<>());
	}
	@Override
	public userDto getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		userDto returnValue = new userDto();
		userEntity user=repository.findByUserId(userId);
		if(user==null)
		throw new Error("User Not Exists");
		BeanUtils.copyProperties(user,returnValue);
		return returnValue;
	}

}
