package net.codejava.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.codejava.Dto.AccountDto;
import net.codejava.Entity.AccountEntity;
import net.codejava.Mapper.AccountMapper;
import net.codejava.Repository.AccountRepository;
import net.codejava.Service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {

		AccountEntity accountEntity = AccountMapper.mapToAccount(accountDto);

		AccountEntity savedAccountEntity = accountRepository.save(accountEntity);

		return AccountMapper.mapToAccount(savedAccountEntity);

	}

}
