package net.codejava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.Entity.CustomerEntity;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
