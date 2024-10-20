package net.codejava.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.Entity.CustomerEntity;
import net.codejava.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository CustomerRepo;

	public void save(CustomerEntity customer) {
		CustomerRepo.save(customer);
	}
}
