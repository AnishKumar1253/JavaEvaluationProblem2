package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.Email;

public interface EmailService 
{
	public List<Email> getAllEmail();
	public Email getEmail(String mail_id);
	public void deleteEmail(String mail_id);
	public Email createEmail(Email email);
	public void updateEmail(Email email);

}
