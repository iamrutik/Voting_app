package com.jsp.votingapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.votingapp.dto.Login;
import com.jsp.votingapp.dto.ResponseStructure;
import com.jsp.votingapp.dto.User;
import com.jsp.votingapp.service.UserService;

@RestController
public class UserController {
@Autowired
     UserService userService;
@PostMapping("/users")
public ResponseStructure<User> saveUser(@RequestBody User user){
	return userService.saveUser(user);
}

@GetMapping("/users/{id}")
public ResponseStructure<User> getUser(@PathVariable int id){
	return userService.getUser(id);
}
@PutMapping("/username/{id}")
public ResponseStructure<User> updateNameUser(@PathVariable int id, @RequestBody User user){
	return userService.updateName(id, user);
}
@PutMapping("/useremail/{id}")
public ResponseStructure<User> updateEmailUser(@PathVariable int id, @RequestBody User user){
	return userService.updateEmailUser(id, user);
}

@DeleteMapping("/users/{id}")
public ResponseStructure<String> deleteUsers(@PathVariable int id){
	return userService.deleteUser(id);
}

@GetMapping("/users")
public  ResponseStructure<List<User>> getAllUser(){
	return userService.getAllUser();
}

@GetMapping("/login/{id}")
public ResponseStructure<User> verifyLogin(@PathVariable int id, @RequestBody Login login){
	return userService.verifyLogin(id, login);
}
}
