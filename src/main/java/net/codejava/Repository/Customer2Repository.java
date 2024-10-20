package net.codejava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Controller.Customer2Controller;
import net.codejava.Entity.Customer2Entity;

public interface Customer2Repository extends JpaRepository<Customer2Entity, Integer>{

	void save(Customer2Controller customer);

}
