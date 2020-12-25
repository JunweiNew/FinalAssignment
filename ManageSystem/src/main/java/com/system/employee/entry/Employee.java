package com.system.employee.entry;

public class Employee {
	private int empId;
	private String empJob;
	private String name;
	private String sex;
	private String phone;
	private String mobile;
	private String email;
	private String idCard;
	private String address;
	private String post;

	public Employee() {
	}

	public Employee(int empId, String empJob, String name, String sex, String phone,
			String mobile, String email, String idCard, String address,
			String post) {
		super();
		this.setEmpId(empId);
		this.setEmpJob(empJob);
		this.setName(name);
		this.setSex(sex);
		this.setPhone(phone);
		this.setMobile(mobile);
		this.setEmail(email);
		this.setIdCard(idCard);
		this.setAddress(address);
		this.setPhone(phone);
		
	}
	
	public String toString(){
		
		return "empId:" + empId + ";empJob:" + empJob + ";name:" + name + ";sex:" + sex + ";phone:"+ phone + ";moble:" + mobile + ";email:" + email + ";idCard:" +idCard + "address:" + address + ";post:"
		+ post;
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
}
