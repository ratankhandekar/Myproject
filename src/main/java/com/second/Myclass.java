package com.second;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {
	
	
	@RequestMapping("aaa")
	Student jasdkhs()
	{
		Student s=new Student(1, "gauri", 38);
		return s;
		
	}

}
