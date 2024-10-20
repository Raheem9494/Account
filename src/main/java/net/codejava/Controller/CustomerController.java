package net.codejava.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.Entity.CustomerEntity;
import net.codejava.Service.CustomerService;	

@RestController
public class CustomerController {
	@Autowired
	CustomerService CustomerService;

	@PostMapping("save")
	public String save(@RequestBody CustomerEntity customer) {
		CustomerService.save(customer);
		return "save successfully";
	}
}
