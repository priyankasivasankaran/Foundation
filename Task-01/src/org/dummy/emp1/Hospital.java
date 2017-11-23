package org.dummy.emp1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PATIENT_DETAILS")

public class Hospital {

		public Hospital(String fname, String lname, long phno, String email, String dob, String gender,
			String address, String disease) {
		super();

		this.fname = fname;
		this.lname = lname;
		this.phno = phno;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.disease = disease;
	}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		@Id
		@GeneratedValue
		private int id;
		@Column(name = "FIRST_NAME")
		private String fname;
		@Column(name = "LAST_NAME", length = 150, nullable = false)
		private String lname;
		@Column(name = "PHONE_NO", length = 10, nullable = false, unique = true)
		private long phno;
		@Column(name = "EMAIL_ID", length = 150, nullable = false, unique = true)
		private String email;
		@Column(name = "DOB", length = 150, nullable = false, unique = true)
		private String dob;
		@Column(name = "GENDER", length = 150, nullable = false, unique = true)
		private String gender;
		@Column(name = "ADDRESS", length = 150, nullable = false, unique = true)
		private String address;
		@Column(name = "DISEASE", length = 150, nullable = false, unique = true)
		private String disease;
	}
	