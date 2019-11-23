package com.rajat.app.ws.ui.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "firstName", "lastName", "email", "password" })
public class userDetailRequestModel {
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;
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
	 * @return the lastname
	 */
	public String getLastname() {
		return lastName;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastName) {
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
	@Override
	public String toString() {
		return "userDetailRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", getFirstName()=" + getFirstName() + ", getLastname()=" + getLastname()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + "]";
	}
}
