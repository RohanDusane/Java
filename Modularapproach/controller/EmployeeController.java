package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	
	public static void main(String[] args) throws Exception{
		EmployeeService es = new EmployeeService();
		es.insertdata();
		//es.updatedata();
		//es.deletedata();
		//es.selectdata();
	}

}
