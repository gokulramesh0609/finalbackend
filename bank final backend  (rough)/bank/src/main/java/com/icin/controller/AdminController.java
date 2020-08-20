package com.icin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icin.model.Admin;
import com.icin.model.User;
import com.icin.service.AdminService;
import com.icin.service.UserService;

@RestController
public class AdminController 
{
	@Autowired
	UserService userService; 
	
	@Autowired
	AdminService adminService;

	@RequestMapping(path = "/index", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public Boolean toValidate(@RequestBody Admin admin)
	{
		System.out.println("hi");
		return adminService.validateResult(admin);
	}
	
	@RequestMapping(path ="/api/user/all", method=RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	public  List<User>  returnAllUsers()
	{
		return userService.fetchAllUsers();
	} 
	
	
	
}
