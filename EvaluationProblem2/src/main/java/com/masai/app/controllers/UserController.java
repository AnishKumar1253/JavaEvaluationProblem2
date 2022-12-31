package com.masai.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.entity.User;
import com.masai.app.service.UserServiceImpl;


@RestController
@RequestMapping("/userservice/users") 
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/")
	public List<User> getAllUsers() {
		List<User> users=this.userServiceImpl.getAllUsers();
		return users;
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createUser(@RequestBody User book) {
		User b=this.userServiceImpl.createUser(book);
		if(b==null) {
			return ResponseEntity.ok("The User already exists hence could not be created");
		}
		return ResponseEntity.ok(b);
	}
	
//	@PutMapping("/{bookId}")
//	public ResponseEntity<?> updateUser(@RequestBody String price,@PathVariable("bookId") int bookId){
////		System.out.println(price.substring(15,18));
//		int bookPrice=Integer.parseInt(price.substring(15,18)); 
//		User book=this.userServiceImpl.getUser(bookId);
////		 if(book!=null) {
////			 this.userServiceImpl.updateUserPrice(book, bookPrice);
////			 return ResponseEntity.ok("the price of the book has been updated with "
////			 		+ "the given value");
////		 }
//		 return ResponseEntity.ok("the book is not present");
//	}
	
	
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("bookId") int bookId) {
		User book=this.userServiceImpl.getUser(bookId);
		return book;
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("bookId") int bookId) {
		this.userServiceImpl.deleteUser(bookId);
		return "User has been deleted successfully";
	}
}

