package net.codejava.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import net.codejava.Dto.AccountDto;
import net.codejava.Service.AccountService;
@Slf4j
@RestController
@RequestMapping("api/accounts")
public class AccountController {
 
	
	//@Autowired
	private AccountService accountService;
	
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
		log.info("AccountDto {}", accountDto);
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

}
