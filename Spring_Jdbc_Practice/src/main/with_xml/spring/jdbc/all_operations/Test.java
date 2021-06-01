package spring.jdbc.all_operations;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.jdbc.dao.StudentDao;
import spring.jdbc.entity.Student;




public class Test {

	public static void main(String[] args) 
		{
			/*When We use "Config.xml" file then we should go for
			  "ClassPathXmlApplicationContext"... */
			/*ApplicationContext cxt=new ClassPathXmlApplicationContext
					                ("spring/jdbc/all_operations/config.xml");*/
		
		
			/*When We use "javaConfig.class"  then we should go for
			  "AnnotationConfigApplicationContext"... */
			ApplicationContext cxt = new AnnotationConfigApplicationContext(javaConfig.class);
			StudentDao st =cxt.getBean("studentdao",StudentDao.class);
			Student student = new Student();
			
			/*Insert Data*/
			/*student.setId(103);
			student.setName("Ayan");
			student.setCity("gwalior");
		    int res = st.insert(student); 
		    System.out.println("number of record inserted : "+res);
			*/
			
			/*Update Data*/
			/*student.setName("Shadab");
			student.setId(104);
			int res = st.update(student);
			System.out.println("number of record updated : "+res);
			*/
			
			/*Delete Data*/
			/*
			  int res = st.delete(102);
			  System.out.println("number of record deleted : "+res);
			*/
			
			
			/*Select Query Data*/
			/*
			  Student student2 = st.getStudent(101);
			  System.out.println("fetch Data : \n"+student2);
			 */
			
			/*All Detail Fetch with Select Query*/
			  List<Student> stud = st.getAllStudent();
			  for(Student s:stud)
			  System.out.println("Get Detail : \n"+s);
			 
				
		}

}
