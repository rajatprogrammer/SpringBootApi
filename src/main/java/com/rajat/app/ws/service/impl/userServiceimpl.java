package com.rajat.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
