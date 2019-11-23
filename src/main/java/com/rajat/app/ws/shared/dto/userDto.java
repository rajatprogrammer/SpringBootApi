package com.rajat.app.ws.shared.dto;

import java.io.Serializable;

public class userDto implements Serializable{
	private static final long serialVersionUID = 2603910053433451027L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private boolean emailVerificationStatus=false;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the encryptedPassword
	 */
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	/**
	 * @param encryptedPassword the encryptedPassword to set
	 */
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	/**
	 * @return the emailVerificationToken
	 */
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	/**
	 * @param emailVerificationToken the emailVerificationToken to set
	 */
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	/**
	 * @return the emailVerificationStatus
	 */
	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	/**
	 * @param emailVerificationStatus the emailVerificationStatus to set
	 */
	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "userDto [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", encryptedPassword=" + encryptedPassword
				+ ", emailVerificationToken=" + emailVerificationToken + ", emailVerificationStatus="
				+ emailVerificationStatus + "]";
	}

	
	
	
}
