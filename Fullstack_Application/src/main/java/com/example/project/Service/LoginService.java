package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entity.LoginEntity;
import com.example.project.Repo.LoginRepo;

@Service
public class LoginService implements LoginInterface {
	
	@Autowired
	private LoginRepo lr;
	
	public List<LoginEntity> getLoginDetails(){
		return lr.findAll();
	}
	public void saveData(LoginEntity le)
	{
		lr.save(le);
	}
	
	public void updateData(LoginEntity le)
	{
		lr.save(le);
	}
	
	public void deleteData(String id)
	{
		lr.deleteById(id);	
	}

}
