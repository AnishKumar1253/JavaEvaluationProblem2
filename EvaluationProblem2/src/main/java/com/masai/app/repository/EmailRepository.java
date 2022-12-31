package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,String>
{
	public List<Email> findBymail_id(String mail_id);
	
}


