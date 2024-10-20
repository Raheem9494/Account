package net.codejava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.Dto.EmplyeeDto;
import net.codejava.Entity.EmplyeeEntity;

@Repository
public interface EmplyeeRepository extends JpaRepository<EmplyeeEntity, Integer> {

	EmplyeeEntity save(EmplyeeDto emplyeeDto);

}
