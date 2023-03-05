package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entity.SignupEntity;
import com.example.project.Service.SignupService;

@CrossOrigin
@RequestMapping("/Signup")
@RestController
public class SignupController {

	
	@Autowired
	private SignupService ss;
	
	@GetMapping("/get")
	public List<SignupEntity> getDetails()
	{
		return ss.getSignupDetails();
	}
	
	@GetMapping("/get/{id}")
	public void getData1(@PathVariable("id") int id)
	{
		ss.getData1(id);
	}
	
	@PostMapping("/post")
	public void saveData(@RequestBody SignupEntity se)
	{
		ss.saveData(se);
	}
	
	@PutMapping("/put")
	public void updateData(@RequestBody SignupEntity se,@RequestParam int id)
	{
		se.setId(id);
		ss.updateData(se);
	}
	
	@DeleteMapping("/delete")
	public void deleteData(int id)
	{
		ss.deleteData(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteData1(@PathVariable("id") int id)
	{
		ss.deleteData1(id);
	}
}
