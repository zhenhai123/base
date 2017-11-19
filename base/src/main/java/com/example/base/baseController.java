package com.example.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class baseController {
	
	
	@RequestMapping(value="/")
	public String index(){
		
		return "baseIndex";
		
	}

}
