package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CurrencyConversionController {
	@Autowired
	private Environment environment; 
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retrieveExchangeValue(
				@PathVariable String from, 
				@PathVariable String to,
				@PathVariable BigDecmial quantity){
		
		return exchangeValue; 
}
