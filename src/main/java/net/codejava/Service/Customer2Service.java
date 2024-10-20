package net.codejava.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.codejava.Entity.Customer2Entity;
import net.codejava.Repository.Customer2Repository;

@Service
public class Customer2Service {
@Autowired
Customer2Repository Customer2Repo;

public void save(Customer2Entity customer) {
	Customer2Repo.save(customer);
}

}
