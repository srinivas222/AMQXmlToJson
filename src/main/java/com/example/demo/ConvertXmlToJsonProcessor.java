package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.domain.Customer;

public class ConvertXmlToJsonProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("process class");
		Customer customer = (Customer) exchange.getIn().getBody();

	}

}
