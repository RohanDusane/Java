package com.service;

import com.dao.StudentDao;

public class StudentService {
	
	public void insertData() throws Exception {
		StudentDao ed = new StudentDao();
		ed.insertData();

	}

	public void updateData() throws Exception {
		StudentDao ed = new StudentDao();
		ed.updateData();

	}

	public void deleteData() throws Exception {
		StudentDao ed = new StudentDao();
		ed.deleteData();

	}

	public void selectData() throws Exception {
		StudentDao ed = new StudentDao();
		ed.selectData();

	}
}


