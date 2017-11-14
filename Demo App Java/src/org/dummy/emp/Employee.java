package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {

	public double getBasicSalry() {
		return basicSalry;
	}

	public void setBasicSalry(double basicSalry) {
		this.basicSalry = basicSalry;
	}

	public float getHouserentAllowance() {
		return houserentAllowance;
	}

	public void setHouserentAllowance(float houserentAllowance) {
		this.houserentAllowance = houserentAllowance;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	public Employee(String name, String emailId, long phone) {

		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	

	

	@Id
	@GeneratedValue
	
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "NAME", length = 150,nullable=false)
	private String name;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "PHONE")
	private long phone;
	@Column(name = "BASIC_SALARY")
	private double basicSalry;
	@Column(name = "HRA")
	private float houserentAllowance;
	@Column(name = "TA")
	private float travelAllowance;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "PF")
	private float providentFund;
	@Transient
	private float netSalary;
	
};