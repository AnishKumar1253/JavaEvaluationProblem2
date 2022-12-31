package com.masai.app.service;

import java.util.List;

import com.masai.app.entity.User;


public interface UserService 
{
	public List<User> getAllUsers();
	public User getUser(int id);
	public void deleteUser(int id);
	public User createUser(User user);
	public void updateUser(User user);
	//to update the book using the price parameter
	//public void updateBookPrice(Book book,int price);

}
