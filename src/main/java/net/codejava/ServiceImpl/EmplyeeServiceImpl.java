package net.codejava.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.Dto.EmplyeeDto;
import net.codejava.Entity.EmplyeeEntity;
import net.codejava.Exception.ResourceNotFoundException;
import net.codejava.Mapper.EmplyeeMapper;
import net.codejava.Repository.EmplyeeRepository;
import net.codejava.Service.EmplyeeService;

@Service
public class EmplyeeServiceImpl implements EmplyeeService {

	@Autowired
	EmplyeeRepository EmplyeeRepo;

	@Override
	public EmplyeeDto creatEplyee(EmplyeeDto emplyeeDto) {

		EmplyeeEntity emplyee = EmplyeeMapper.mapToEmplyee(emplyeeDto);

		EmplyeeEntity savedEmplyee = EmplyeeRepo.save(emplyeeDto);

		return EmplyeeMapper.mapToEmplyeeDto(savedEmplyee);
	}

	@Override
	public EmplyeeDto getEmplyeeById(Integer EmplyeeId) {
		EmplyeeEntity emplyee = EmplyeeRepo.findById(EmplyeeId).orElseThrow(
				() -> new ResourceNotFoundException("emplyee is not exists with gevin number + emplyeeId"));

		return EmplyeeMapper.mapToEmplyeeDto(emplyee);
	}

	@Override
	public List<EmplyeeDto> getAllEmplyee() {

		List<EmplyeeEntity> emplyees = EmplyeeRepo.findAll();

		return emplyees.stream().map((emplyee) -> EmplyeeMapper.mapToEmplyeeDto(emplyee)).collect(Collectors.toList());

	}

	@Override
	public EmplyeeDto updateEmplyee(Integer EmplyeeId, EmplyeeDto updatedEmplyee) {
		EmplyeeEntity emplyee = EmplyeeRepo.findById(EmplyeeId).orElseThrow(
				() -> new ResourceNotFoundException("emplyee is not exists with gevin number + emplyeeId"));

		emplyee.setFirstName(updatedEmplyee.getFirstName());
		emplyee.setLastName(updatedEmplyee.getLastName());
		emplyee.setGmail(updatedEmplyee.getGmail());
		EmplyeeEntity updatedEmplyeeObj = EmplyeeRepo.save(emplyee);

		return EmplyeeMapper.mapToEmplyeeDto(updatedEmplyeeObj);
	}

	@Override
	public void deleteEmplyed(Integer emplyeeId) {

		EmplyeeEntity emplyee = EmplyeeRepo.findById(emplyeeId).orElseThrow(
				() -> new ResourceNotFoundException("emplyee is not exists with gevin number + emplyeeId"));
		EmplyeeRepo.deleteById(emplyeeId);

	}
}
