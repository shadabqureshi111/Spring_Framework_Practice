package com.orm.dao;

import java.util.List;

import com.orm.entities.Student;

public interface StudentDao 
{
	public int insert(Student student);
	public void update(Student student);
	public int Delete(int id);
	public Student getStudent(int id);
	
	public List<Student> getAllStudent();
}
