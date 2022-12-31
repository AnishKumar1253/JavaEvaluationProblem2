package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.masai.app.entity.Email;

public class EmailServiceImpl extends Email 
{
private List<Email> emails=new ArrayList<Email>();
	
	//to create a email and add it in the list using post request
	public Email createEmail(Email email) {
		int flag=0;
		for(Email b:emails) {
			if(b.getEmail()==email.getEmail()) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Email is already present");
			return null;
		}
		else {
			emails.add(email);
			System.out.println("The email has been added");
			return email;
		}
		
	}
	
	

	public List<Email> getAllEmails() {
		return emails;
	}
	
	

	public Email getEmail(String mail_Id) {
	
		
		List<Email> emails=this.emails.stream()
				.filter(b->b.getEmail()==mail_Id)
				.collect(Collectors.toList());
		System.out.println(emails.toString());
		
		return emails.get(0);
	}

	public void deleteEmail(String mail_Id) {
		int flag=0;
		for(Email b:emails) {
			if(b.getEmail()==mail_Id) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
		Email email=getEmail(mail_Id);
		emails.remove(email);
		System.out.println("the email has been deleted");
		}else {
			System.out.println("Email not found hence not deleted");
		}

	}




	public void updateEmail(Email email) {
	
		
		for(Email b:emails) {
			if(b.getEmail()==email.getEmail()) {
				b.setMail_id("anish@gmail.com");
				System.out.println("The email has been updated successfully");
				return;
			}
			
		}
		System.out.println("The email could not be updated as it is not present");
		return;
		
	}




//	public void updateEmailPrice(Email email,int price) {
//		for(Email b:emails) {
//			if(b.getEmail()==email.getEmail()) {
//				b.setPrice(price);
//				System.out.println("the email has been updated with the given price");
//				return;
//			}
//		}
//		return;
//		
//	}
	
	

}
