package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.masai.app.entity.User;

public class UserServiceImpl extends User 
{
private List<User> users=new ArrayList<User>();
	
	//to create a user and add it in the list using post request
	public User createUser(User user) {
		int flag=0;
		for(User b:users) {
			if(b.getId()==user.getId()) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("User is already present");
			return null;
		}
		else {
			users.add(user);
			System.out.println("The user has been added");
			return user;
		}
		
	}
	public List<User> getAllUsers() 
	{
		return users;
	}
	
	public User getUser(int id)
	{
	
		
		List<User> users=this.users.stream()
				.filter(b->b.getId()==id)
				.collect(Collectors.toList());
		System.out.println(users.toString());
		
		return users.get(0);
	}
	
	
	public void deleteUser(int id) {
		int flag=0;
		for(User b:users) {
			if(b.getId()==id) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
		User book=getUser(id);
		users.remove(book);
		System.out.println("the book has been deleted");
		}else {
			System.out.println("User not found hence not deleted");
		}

	}




	public void updateUser(User user) {
	
		
		for(User b:users) {
			if(b.getId()==user.getId()) {
				b.setName("MongoDB");
				System.out.println("The book has been updated successfully");
				return;
			}
			
		}
		System.out.println("The book could not be updated as it is not present");
		return;
		
	}




//	public void updateUserPrice(User book,int price) {
//		for(User b:users) {
//			if(b.getId()==book.getId()) {
//				b.setPrice(price);
//				System.out.println("the book has been updated with the given price");
//				return;
//			}
//		}
//		return;
//		
//	}
	

}
