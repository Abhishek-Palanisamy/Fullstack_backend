package com.example.project.Service;

import java.util.List;

import com.example.project.Entity.SignupEntity;

public interface SignupInterface {

	public List<SignupEntity> getSignupDetails();
	public void saveData(SignupEntity se);
	public void updateData(SignupEntity se);
	public void deleteData (int id);
	public void deleteData1(int id);
	public void getData1(int id);
}
