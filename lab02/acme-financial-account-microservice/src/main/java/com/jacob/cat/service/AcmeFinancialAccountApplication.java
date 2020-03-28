package com.jacob.cat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.invoke.MethodHandles;

@RestController
public class AcmeFinancialAccountApplication {

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@RequestMapping("/startOfAccount-Microservice")
	public String service3MethodInController() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Hello from Acme Financial's Account Microservice");
		return "Hello from Acme Financial's Account Microservice";
	}

}
