package com.example.project.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entity.BeverageEntity;
import com.example.project.Service.BeverageService;




@RestController
@RequestMapping("/Beverages")
@CrossOrigin
public class BeverageController {
	
	@Autowired
	private BeverageService bs;
	@DeleteMapping("/deletebeverages")
	public void deleteData(@RequestParam int id) {
		 bs.deleteData(id);}
	@GetMapping("/getbeverages")
	public List<BeverageEntity> getDetails(){
		return bs.getDetails();
	}
	@PostMapping("/postbeverages")
	public void saveData(@RequestBody BeverageEntity be){
		bs.saveData(be);
}
}
