package com.dao;

import java.util.HashMap;

import com.bean.Helper;

public class EmployeeDao {
Helper h;
	HashMap<Integer,Helper> hm=new HashMap<>();
	public void storageDao(Helper h)
{
		hm.put(h.getEmpId(),h);
		System.out.println("added");
}
public Helper displayStore(int id) {
	Helper h=hm.get(id);
	System.out.println(h);
	return h;
	
}	 
}
