package org.openmrs.module.mycarehub.api.rest.mapper;

import com.google.gson.annotations.SerializedName;

public class PatientRegistrationRequest {
	
	@SerializedName("facility")
	private String facility;
	
	@SerializedName("ccc_number")
	private String cccNumber;
	
	@SerializedName("name")
	private String name;
	
	@SerializedName("dateOfBirth")
	private String dateOfBirth;
	
	@SerializedName("client_type")
	private String clientType;
	
	@SerializedName("phone_number")
	private String phoneNumber;
	
	@SerializedName("enrollment_date")
	private String enrollmentDate;
	
	@SerializedName("birthdateEstimated")
	private boolean birthdateEstimated;
	
	@SerializedName("gender")
	private String gender;
	
	@SerializedName("counseled")
	private String counseled;
	
	@SerializedName("next_of_kin")
	private String nextOfKin;
	
	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public String getFacility() {
		return facility;
	}
	
	public void setCccNumber(String cccNumber) {
		this.cccNumber = cccNumber;
	}
	
	public String getCccNumber() {
		return cccNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
	public String getClientType() {
		return clientType;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
	public String getEnrollmentDate() {
		return enrollmentDate;
	}
	
	public void setBirthdateEstimated(boolean birthdateEstimated) {
		this.birthdateEstimated = birthdateEstimated;
	}
	
	public boolean getBirthdateEstimated() {
		return birthdateEstimated;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setCounseled(String counseled) {
		this.counseled = counseled;
	}
	
	public String getCounseled() {
		return counseled;
	}
	
	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	
	public String getNextOfKin() {
		return nextOfKin;
	}
}
