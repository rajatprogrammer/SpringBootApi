package com.rajat.app.ws.security;

import com.rajat.app.ws.SpringApplicationContext;

public class securityConstant {
	public static final long EXPIRATION_TIME=864000;
	public static final String TOKEN_PREFIX="Bearer";
	public static final String HEADER_STRING="Authorization";
	public static final String SIGN_UP_URL="/user/create/user";
	
	public static String getTokenSecret() {
		AppProperties appProperties = (AppProperties) SpringApplicationContext.getBeans("AppProperties");
		return appProperties.getTokenSecret();
	}
}
