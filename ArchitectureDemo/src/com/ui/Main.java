 package com.ui;

import java.util.Scanner;

import com.bean.Helper;
import com.service.EmpService;

public class Main {
	

//Helper h;

public static void main(String args[]) {
	EmpService es=new EmpService();
	Helper h;
	int c;
	
	Scanner sc=new Scanner(System.in); 
	int i=0;
	do{
	System.out.println("Select one option :/n1.add /n2.get /n3.exit");
	
	System.out.println("ENter a choice:");
	c=sc.nextInt();
	switch(c) {
	case 1:
		System.out.println("enter id:");
		int id=sc.nextInt();
		System.out.println("enter ename:");
		String ename=sc.next();
		System.out.println("enter salary:");
		long sal=sc.nextLong();
		h=new Helper(id,ename,sal);
		es.getEmp(h);
		//es.getEmp();
	break;
	
	case 2:
		System.out.println("Enter id:");
		int id1=sc.nextInt();
		es.display(id1);
	//es.display();
		break;
	case 3:
		System.exit(0);
	
}				

	}while(c!=3);

}

}