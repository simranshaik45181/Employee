package com.service;

import java.util.Scanner;

import com.bean.Helper;
import com.dao.EmployeeDao;
import java.util.Date;
public class EmpService {
Helper h; 
	Scanner sc=new Scanner(System.in);
EmployeeDao ed=new EmployeeDao();
	public void getEmp(Helper h) {
	ed.storageDao(h);
	}
	public void display(int id1) {
		ed.displayStore(id1);
	}
}
