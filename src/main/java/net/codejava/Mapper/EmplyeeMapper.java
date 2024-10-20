package net.codejava.Mapper;

import net.codejava.Dto.EmplyeeDto;
import net.codejava.Entity.EmplyeeEntity;

public class EmplyeeMapper {
public static EmplyeeDto mapToEmplyeeDto(EmplyeeEntity emplyee) {
	
	return new EmplyeeDto(
			
			emplyee.getId(),
			emplyee.getFirstName(),
			emplyee.getLastName(),
			emplyee.getGmail()
			
			);	
}
		public static EmplyeeEntity mapToEmplyee(EmplyeeDto emplyeeDto) {
			return new EmplyeeEntity(
					
					emplyeeDto.getId(),
					emplyeeDto.getFirstName(),
					emplyeeDto.getLastName(),
					emplyeeDto.getGmail()
					);
		}
		
}
