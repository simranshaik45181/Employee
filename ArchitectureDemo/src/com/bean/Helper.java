package com.bean;

public class Helper {
int empId;
String ename;
long Salary;

public Helper() {
	
}
public Helper(int id,String ename,long sal) {
	this.empId=id;
	this.ename=ename;
	this.Salary=sal;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public long getSalary() {
	return Salary;
}
public void setSalary(long salary) {
	Salary = salary;
}
@Override
public String toString() {
	return "Helper [empId=" + empId + ", ename=" + ename + ", Salary=" + Salary + "]";
}

}
