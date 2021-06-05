package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.StudentDao;
import com.orm.dao.StudentDaoImpl;
import com.orm.entities.Address;
import com.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome in Spring Orm..");

		ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentdao = cxt.getBean("studentdao", StudentDao.class);

		/* Address class Field Define */
		Address address = new Address();
		address.setCity("Banmore");
		address.setState("M.P.");

		/* Student class Field Define */
		Student student = new Student();
		student.setName("Ayan");
		student.setAddress(address);

		/* Insert Method Call */
		int i = studentdao.insert(student);
		System.out.println("Inserted : " + i);

		/* Update Method Call */
		student.setId(26);
		student.setName("DU");
		studentdao.update(student);

		/* Method Of Get One Student Detail */
		Student student2 = studentdao.getStudent(5);
		System.out.println("Get : " + student2);

		/* Method Of Get All Student Detail */
		List<Student> allStudent = studentdao.getAllStudent();
		for (Student st : allStudent) {
			System.out.println("GetAllStudent : " + st);
		}

		
		/* Delete Method Call */
		studentdao.Delete(20); 
		 
		 
	}
}
