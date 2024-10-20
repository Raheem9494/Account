package net.codejava.Mapper;

import net.codejava.Dto.AccountDto;
import net.codejava.Entity.AccountEntity;

public class AccountMapper {
	
	public static AccountEntity mapToAccount (AccountDto accountDto) {
		
		AccountEntity accountEntity = new AccountEntity(
				
			accountDto.getId(),
			accountDto.getHolderName(),
			accountDto.getAmmount()
				);
		return accountEntity;
	}
   
	public static AccountDto mapToAccount (AccountEntity accountEntity) {
		
		AccountDto accountDto = new AccountDto(
				
				accountEntity.getId(),
				accountEntity.getHolderName(),
				accountEntity.getAmmount()
			);
		return accountDto;
	    }
	
	
}
