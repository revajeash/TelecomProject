package com.telecom.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.model.RegisteredNetwork;
import com.telecom.repository.RegisteredNetworkRepository;
import com.telecom.service.RegisterdNetworkService;

@Service
public class RegisteredNetworkServiceImpl implements RegisterdNetworkService{

	//inject
	@Autowired
	public RegisteredNetworkRepository registeredNetworkRepository;
	
	@Override
	public RegisteredNetwork saveRegisteredNetwork(RegisteredNetwork registeredNetwork) {
		RegisteredNetwork rn=registeredNetworkRepository.save(registeredNetwork);
		return rn;
	}

	
}
