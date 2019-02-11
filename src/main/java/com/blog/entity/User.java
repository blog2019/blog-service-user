package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@GeneratedValue(generator = "system-uuid")
	private String id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private String avatar;
	@Column(nullable = false)
	private String userName;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int isActivated;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastLoginTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createTs;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastUpdateTs;

	public User() {
		super();
	}
	


	public User(String id, String firstName, String lastName, String gender, String avatar, String userName,
			String password, String email, int isActivated, Date lastLoginTs, Date createTs, Date lastUpdateTs) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.avatar = avatar;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.isActivated = isActivated;
		this.lastLoginTs = lastLoginTs;
		this.createTs = createTs;
		this.lastUpdateTs = lastUpdateTs;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAvatar() {
		return avatar;
	}



	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getIsActivated() {
		return isActivated;
	}



	public void setIsActivated(int isActivated) {
		this.isActivated = isActivated;
	}



	public Date getLastLoginTs() {
		return lastLoginTs;
	}



	public void setLastLoginTs(Date lastLoginTs) {
		this.lastLoginTs = lastLoginTs;
	}



	public Date getCreateTs() {
		return createTs;
	}



	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}



	public Date getLastUpdateTs() {
		return lastUpdateTs;
	}



	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}
}