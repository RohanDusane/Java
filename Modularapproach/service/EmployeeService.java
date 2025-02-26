package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	
	public void insertdata() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insertdata();
		
	}
	
	public void UpdateData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();
		
	}
	
	public void deleteData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();
		
	}
	
	public void selectData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.selectData();
		
	}
}


