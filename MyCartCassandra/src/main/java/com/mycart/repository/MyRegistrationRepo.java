package com.mycart.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycart.entity.Registration;

@Repository
public interface MyRegistrationRepo extends CassandraRepository<Registration, String> {

	Registration insert(Registration registration);
	@Transactional
	@Query("update Registration set save_verification_flag=:isRead  where email_id=:email_id")
	public void saveVerificationFlag(@Param("isRead") boolean isRead, @Param("email_id") String email_id);

	@Transactional
	@Query("update Registration set otp=:isotp  where email_id=:email_id")
	public void saveOtp(@Param("isotp") String isotp, @Param("email_id") String email_id);

}
