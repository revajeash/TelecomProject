package com.telecom.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.model.RegisteredNetwork;
import com.telecom.service.RegisterdNetworkService;

@RestController
public class RegisteredNetworkRestController {
	@Autowired
	public RegisterdNetworkService registerdNetworkService;

	@PostMapping("/saveRegisteredNetwork")
	public RegisteredNetwork saveRegisteredNetwork(@RequestBody RegisteredNetwork registeredNetwork) {
		RegisteredNetwork reg= registerdNetworkService.saveRegisteredNetwork(registeredNetwork);
	    return reg;
	}
}
