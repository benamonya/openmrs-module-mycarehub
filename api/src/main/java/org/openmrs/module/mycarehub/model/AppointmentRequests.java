package org.openmrs.module.mycarehub.model;

import org.openmrs.BaseOpenmrsData;

import java.util.Date;

public class AppointmentRequests extends BaseOpenmrsData {
	
	private int id;
	
	private String appointmentUUID;
	
	private String mycarehubId;
	
	private String appointmentType;
	
	private String appointmentReason;
	
	private String provider;
	
	private String status;
	
	private Date requestedDate;
	
	private String requestedTimeSlot;
	
	private Date progressDate;
	
	private String progressBy;
	
	private Date dateResolved;
	
	private String resolvedBy;
	
	private String clientName;
	
	private String clientContact;
	
	private String cccNumber;
	
	private String mflCode;
	
	public AppointmentRequests() {
	}
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAppointmentUUID() {
		return appointmentUUID;
	}
	
	public void setAppointmentUUID(String appointmentUUID) {
		this.appointmentUUID = appointmentUUID;
	}
	
	public Date getRequestedDate() {
		return requestedDate;
	}
	
	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}
	
	public String getRequestedTimeSlot() {
		return requestedTimeSlot;
	}
	
	public void setRequestedTimeSlot(String requestedTimeSlot) {
		this.requestedTimeSlot = requestedTimeSlot;
	}
	
	public String getMycarehubId() {
		return mycarehubId;
	}
	
	public void setMycarehubId(String mycarehubId) {
		this.mycarehubId = mycarehubId;
	}
	
	public String getAppointmentType() {
		return appointmentType;
	}
	
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}
	
	public String getAppointmentReason() {
		return appointmentReason;
	}
	
	public void setAppointmentReason(String appointmentReason) {
		this.appointmentReason = appointmentReason;
	}
	
	public String getProvider() {
		return provider;
	}
	
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getProgressDate() {
		return progressDate;
	}
	
	public void setProgressDate(Date progressDate) {
		this.progressDate = progressDate;
	}
	
	public String getProgressBy() {
		return progressBy;
	}
	
	public void setProgressBy(String progressBy) {
		this.progressBy = progressBy;
	}
	
	public Date getDateResolved() {
		return dateResolved;
	}
	
	public void setDateResolved(Date dateResolved) {
		this.dateResolved = dateResolved;
	}
	
	public String getResolvedBy() {
		return resolvedBy;
	}
	
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getClientContact() {
		return clientContact;
	}
	
	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}
	
	public String getCccNumber() {
		return cccNumber;
	}
	
	public void setCccNumber(String cccNumber) {
		this.cccNumber = cccNumber;
	}
	
	public String getMflCode() {
		return mflCode;
	}
	
	public void setMflCode(String mflCode) {
		this.mflCode = mflCode;
	}
}
