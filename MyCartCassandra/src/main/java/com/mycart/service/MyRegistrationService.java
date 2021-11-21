package com.mycart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.mycart.entity.Registration;
import com.mycart.repository.MyRegistrationRepo;

@Service
public class MyRegistrationService {

	@Autowired
	MyRegistrationRepo myRegistrationRepo;
	

	public Optional<Registration> save(Registration registration) {
		return Optional.of(myRegistrationRepo.insert(registration));

	}
	
	public void saveVerificationFlag(boolean flag,String emailId) {
		 myRegistrationRepo.saveVerificationFlag(flag,emailId);
	}
	
	public void saveVerificationFlag(@Param("isotp") String isotp,@Param("email_id") String email_id) {
		myRegistrationRepo.saveOtp(isotp,email_id);
	}
}
