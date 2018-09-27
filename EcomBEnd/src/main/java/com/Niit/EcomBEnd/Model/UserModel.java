package com.Niit.EcomBEnd.Model;

public class UserModel {

private String UserName;
private String pwd;
private String CustomerName;
private String MobileNumber;
private String EmailId;
private String Enable;
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getMobileNumber() {
	return MobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	MobileNumber = mobileNumber;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getEnable() {
	return Enable;
}
public void setEnable(String enable) {
	Enable = enable;
}
public UserModel(String userName, String pwd, String customerName, String mobileNumber, String emailId, String enable) {
	super();
	UserName = userName;
	this.pwd = pwd;
	CustomerName = customerName;
	MobileNumber = mobileNumber;
	EmailId = emailId;
	Enable = enable;
}
}
