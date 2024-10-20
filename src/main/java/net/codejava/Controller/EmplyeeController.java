package net.codejava.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.codejava.Dto.EmplyeeDto;
import net.codejava.Service.EmplyeeService;

@RestController
@RequestMapping("/api/emplyee")
public class EmplyeeController {
	@Autowired
	EmplyeeService EmplyeeService;

	@PostMapping

	public ResponseEntity<EmplyeeDto> createEmplyee(@RequestBody EmplyeeDto emplyeeDto) {
		EmplyeeDto savedEmplyee = EmplyeeService.creatEplyee(emplyeeDto);

		return new ResponseEntity<>(savedEmplyee, HttpStatus.CREATED);
	}

	@GetMapping("{Id}")
	public ResponseEntity<EmplyeeDto> getBuEmplyeeId(@PathVariable("id") Integer emplyeeId) {
		EmplyeeDto emplyeeDto = EmplyeeService.getEmplyeeById(emplyeeId);
		return ResponseEntity.ok(emplyeeDto);
	}

	@GetMapping
	public ResponseEntity<List<EmplyeeDto>> getAllEmplyees() {
		List<EmplyeeDto> emplyee = EmplyeeService.getAllEmplyee();
		return ResponseEntity.ok(emplyee);
	}

	@PutMapping("{id}")
	public ResponseEntity<EmplyeeDto> updateEmplyee(@PathVariable("id") Integer EmplyeeId,
			@RequestBody EmplyeeDto updatedEmplyeeDto) {
		EmplyeeDto emplyeeDto = EmplyeeService.updateEmplyee(EmplyeeId, updatedEmplyeeDto);
		return ResponseEntity.ok(emplyeeDto);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> DeleteEmplyee(@PathVariable ("id") Integer EmplyeeId) {
		EmplyeeService.deleteEmplyed(EmplyeeId);
		return ResponseEntity.ok("EmplyeeId deleted successfully");
	}

}
