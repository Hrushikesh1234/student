package com.htc.studentapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentID;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private Long mobileNo;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentID, String name, String email, String address, Long mobileNo) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}
