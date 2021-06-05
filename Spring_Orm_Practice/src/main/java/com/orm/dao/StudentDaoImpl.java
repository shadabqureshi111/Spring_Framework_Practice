package com.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.orm.entities.Student;


public class StudentDaoImpl implements StudentDao
{
private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	@Transactional
	public Student getStudent(int Studentid) 
	{
		Student i = (Student)this.hibernateTemplate.load(Student.class,Studentid);
		System.out.println("Impl : "+i);
		return  i;
	}
	
	@Transactional
	public void update(Student student) 
	{
		this.hibernateTemplate.update(student);
	
	}
	
	@Transactional
	public List<Student> getAllStudent() 
	{
		List<Student> st = this.hibernateTemplate.loadAll(Student.class);
		return st;
	}
	
	@Transactional
	public int Delete(int id) {
		Student student = this.hibernateTemplate.load(Student.class, id);
		   this.hibernateTemplate.delete(student);
		return id;
	
		
		
	}
	
	
	


}
