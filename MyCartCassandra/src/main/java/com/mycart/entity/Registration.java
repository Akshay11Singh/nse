package com.mycart.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.tinkerpop.shaded.kryo.NotNull;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "Registration")
public class Registration implements Serializable,Iterable<Registration> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String channelId;
	@NotNull
	@PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	Date timeStamp;
	
	String serviceProvider;
	
	String requestType;
	
	String userType;
	
	String birthDate;
	
	String firstName;
	
	String lastName;
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
	String mobileNumber;
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED, ordering = Ordering.ASCENDING)
	String emailId;
	boolean saveVerificationFlag = false;
	@NotNull
	String otp;

	private static Registration registration;

	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the serviceProvider
	 */
	public String getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * @param serviceProvider the serviceProvider to set
	 */
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		this.birthDate = sdf.format(birthDate);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Registration [channelId=" + channelId + ", timeStamp=" + timeStamp + ", serviceProvider="
				+ serviceProvider + ", requestType=" + requestType + ", userType=" + userType + ", birthDate="
				+ birthDate + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + "]";
	}

	private Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Registration getRegfactory() {

		if (registration == null)
			registration = new Registration();
		else
			return registration;
		return registration;

	}
	/*
	 * static { registration= new Registration(); }
	 */

	public boolean isSaveVerificationFlag() {
		return saveVerificationFlag;
	}

	public void setSaveVerificationFlag(boolean saveVerificationFlag) {
		this.saveVerificationFlag = saveVerificationFlag;
	}

	/**
	 * @return the registration
	 */
	public static Registration getRegistration() {
		return registration;
	}

	/**
	 * @param registration the registration to set
	 */
	public static void setRegistration(Registration registration) {
		Registration.registration = registration;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the otp
	 */
	public String getOtp() {
		return otp;
	}

	/**
	 * @param otp the otp to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public Iterator<Registration> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
