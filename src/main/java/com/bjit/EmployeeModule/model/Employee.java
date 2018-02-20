package com.bjit.EmployeeModule.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee  implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer employeeId;
	@Column(unique=true,name="work_mobile")
	private String workMobile;
	@Column(name="work_address")
	private String workaAddress;
	@Column(name="work_location")
	private String workLocation;
	@Column(unique=true,name="work_phone")
	private String workPhone;
	private String department;
	@Column(name="job_title")
	private String jobTitle;
	private String manager;
	private String coach;
	private String nationality;
	@Column(name="identification_no", unique=true)
	private String identificationNo;
	@Column(name="passport_no", unique=true)
	private String passportNo;
	@Column(name="bank_ac_no", unique=true)
	private String bankAcNo;
	private String gender;
	@Column(name="home_address")
	private String homeAddress;
	@Column(name="marital_status")
	private String maritalStatus;
	@Column(name="date_of_birth")
	Date dateOfBirth = new Date();
	private boolean active;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getWorkMobile() {
		return workMobile;
	}
	public void setWorkMobile(String workMobile) {
		this.workMobile = workMobile;
	}
	public String getWorkaAddress() {
		return workaAddress;
	}
	public void setWorkaAddress(String workaAddress) {
		this.workaAddress = workaAddress;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIdentificationNo() {
		return identificationNo;
	}
	public void setIdentificationNo(String identificationNo) {
		this.identificationNo = identificationNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getBankAcNo() {
		return bankAcNo;
	}
	public void setBankAcNo(String bankAcNo) {
		this.bankAcNo = bankAcNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", workMobile=" + workMobile + ", workaAddress=" + workaAddress
				+ ", workLocation=" + workLocation + ", workPhone=" + workPhone + ", department=" + department
				+ ", jobTitle=" + jobTitle + ", manager=" + manager + ", coach=" + coach + ", nationality="
				+ nationality + ", identificationNo=" + identificationNo + ", passportNo=" + passportNo + ", bankAcNo="
				+ bankAcNo + ", gender=" + gender + ", homeAddress=" + homeAddress + ", maritalStatus=" + maritalStatus
				+ ", dateOfBirth=" + dateOfBirth + ", active=" + active + "]";
	}
	
	
	
}
