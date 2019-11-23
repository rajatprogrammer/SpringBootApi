package com.rajat.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class userEntity implements Serializable {
	private static final long serialVersionUID = 8938638591170529894L;

	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false, length = 50)
	private String firstName;
	@Column(nullable = false, length = 50)
	private String lastName;
	@Column(nullable = false, length = 120, unique = true)
	private String email;
	@Column(nullable = false, length=120)
	private String encryptedPassword;
	@Column(name = "email_token")
	private String emailVerificationToken;

	@Column(nullable = false,columnDefinition = "boolean default false")
	private boolean emailVerificationStatus = false;

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

	@Override
	public String toString() {
		return "userEntity [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", encryptedPassword=" + encryptedPassword + ", emailVerificationToken="
				+ emailVerificationToken + ", emailVerificationStatus=" + emailVerificationStatus + "]";
	}

}
