package edu.jsp.studentapp.bean;
import java.io.Serializable;
public class Student implements Serializable
{
	private int id;
	private String name;
	private String email;
	private long phoneNo;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", age=" + age
//				+ "]";
//	}
}
