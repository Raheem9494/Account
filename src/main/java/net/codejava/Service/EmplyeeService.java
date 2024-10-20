package net.codejava.Service;

import java.util.List;

import net.codejava.Dto.EmplyeeDto;

public interface EmplyeeService {

	EmplyeeDto creatEplyee(EmplyeeDto emplyeeDto);

	EmplyeeDto getEmplyeeById(Integer Emplyee);

	List<EmplyeeDto> getAllEmplyee();

	EmplyeeDto updateEmplyee(Integer EmplyeeId, EmplyeeDto updatedEmplyee);

	public void deleteEmplyed(Integer emplyeeId);

}
