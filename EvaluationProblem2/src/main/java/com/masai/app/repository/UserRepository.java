package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	public List<User> findById(int id);
	
	

}
