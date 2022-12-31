package com.masai.app.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
	@Id
    @GeneratedValue
	private int id;
	private String name;
	private String phoneNo;
	private Date dob;
	
	@OneToOne(mappedBy="Email")
	private Email email;
	
	public User() {}

	public User(int id, String name, String phoneNo, Date dob, Email email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", dob=" + dob + ", email=" + email + "]";
	}

	
	
	

}
