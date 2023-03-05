package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Entity.BeverageEntity;
import com.example.project.Repo.BeverageRepo;


@Service
public class BeverageService implements BeverageInterface{
	@Autowired
	private BeverageRepo br;
	public List<BeverageEntity> getDetails(){
		return br.findAll();
	}
	public void deleteData(int id)
	{
		br.deleteById(id);
	}
	public void saveData(BeverageEntity be) {
		 br.save(be);
	}


}
