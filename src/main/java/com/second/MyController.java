package com.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("save")
	int save(@RequestBody Student student)
	{
		
		studentRepository.save(student);
		return 1;
	}
	
	
	
}
