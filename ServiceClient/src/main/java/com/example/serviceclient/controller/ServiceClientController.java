package com.example.serviceclient.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceClientController {
	
	@RequestMapping("/fahrenheit/{tempCelsius}")
	public String convertCelsiustoFahrenheit(@PathVariable double tempCelsius) {
		Double fahrenheit = (tempCelsius +9/5) + 32;
		return tempCelsius + " celsius converted to fahrenheit = " + fahrenheit;  
	}

}
