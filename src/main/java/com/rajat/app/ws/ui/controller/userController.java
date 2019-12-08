package com.rajat.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.app.ws.shared.dto.userDto;
import com.rajat.app.ws.ui.model.request.userDetailRequestModel;
import com.rajat.app.ws.ui.model.response.userRest;
import com.rajat.app.ws.exceptions.UserServiceException;
import com.rajat.app.ws.service.userService;

@RestController
@RequestMapping("/user")
public class userController {

	@Autowired
	userService userService;

	@GetMapping(path = "/{userId}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public userRest getUser(@PathVariable String userId) {
		userRest userReturnValue = new userRest();
		userDto userDto = userService.getUserByUserId(userId);
		BeanUtils.copyProperties(userDto, userReturnValue);
		return userReturnValue;
	}

	@PostMapping(path = "/create/user", produces = { MediaType.APPLICATION_ATOM_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_ATOM_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public userRest insertUser(@RequestBody userDetailRequestModel userRequest) throws UserServiceException {
		userRest userReturnValue = new userRest();
		if(userRequest.getFirstName()==null) {
			// throw new NullPointerException("null pointer Exception");
			 throw new UserServiceException("first name is required field");
		}	
		userDto userDto = new userDto();
		BeanUtils.copyProperties(userRequest, userDto);
		userDto.setLastName(userRequest.getLastname());
		userDto createUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createUser, userReturnValue);
		return userReturnValue;
	}

	@PutMapping()
	public String updateuser() {
		return "update user is called";
	}

	@DeleteMapping()
	public String deleteUser() {
		return "delete the user from record";
	}
}
