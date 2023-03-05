package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Entity.LoginEntity;
import com.example.project.Service.LoginService;

@RestController
@RequestMapping("/Login")
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginService ls;
	
	 @GetMapping("/getlogin")
	 public List<LoginEntity> getLoginDetails()
	 {
		 return ls.getLoginDetails();
	 }
	 	 
	 @PostMapping("/postlogin")
	 public void saveData(@RequestBody LoginEntity le)
	 {
		 ls.saveData(le);
	 }
	 
	 @PutMapping("/putlogin")
	 public void updateData(@RequestBody LoginEntity le,@RequestParam String id)
	 {
		 le.setUsername(id);
		 ls.updateData(le);
	 }
	 
	 @DeleteMapping("/deletelogin")
	 public void deleteData(@RequestParam String id)
	 {
		 ls.deleteData(id);
	 }
	 
}
