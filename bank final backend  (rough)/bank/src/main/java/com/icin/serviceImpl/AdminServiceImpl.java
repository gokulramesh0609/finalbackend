package com.icin.serviceImpl;

import org.springframework.stereotype.Service;

import com.icin.model.Admin;
import com.icin.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService
{
	public  String storedMailId="admin@gmail.com";
	public String storedPassword="admin_123";
	public String value1="true";
	public String value2="false";
	
	@Override
	public Boolean validateResult(Admin admin) 
	{
	
		if(admin.getEmailId().equals(storedMailId) && admin.getPassword().equals(storedPassword))
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	


}
