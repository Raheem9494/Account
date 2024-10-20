package net.codejava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.Entity.Customer2Entity;
import net.codejava.Service.Customer2Service;

@RestController
@RequestMapping("SAVE")
public class Customer2Controller {
	@Autowired
	Customer2Service Customer2Service;
	
	@PostMapping("SAVE")
	public String save(@RequestBody Customer2Entity customer) {
		Customer2Service.save(customer);
		return "saved successfully";
	}
	

}
