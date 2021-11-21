package com.mycart.repository;

import java.util.Optional;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.mycart.entity.Registration;


@Repository
public interface MyLoginRepo extends CassandraRepository<Registration, String> {

	public Optional<Registration> findByEmailId(String email);
	public Optional<Registration>findByMobileNumber(String mobileNo);
}
