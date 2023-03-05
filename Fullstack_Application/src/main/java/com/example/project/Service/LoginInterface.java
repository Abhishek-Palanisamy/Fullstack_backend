package com.example.project.Service;

import java.util.List;

import com.example.project.Entity.LoginEntity;

public interface LoginInterface {

	public List<LoginEntity> getLoginDetails();
	public void saveData(LoginEntity le);
	public void updateData(LoginEntity le);
	public void deleteData(String id);
}
