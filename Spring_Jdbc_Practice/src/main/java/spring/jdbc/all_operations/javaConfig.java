package spring.jdbc.all_operations;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import spring.jdbc.dao.StudentDao;
import spring.jdbc.dao.StudentDaoImpl;


//This is configuration Class And used it Test.Java
@Configuration
@ComponentScan(basePackages = {"spring.jdbc.dao"})
public class javaConfig 
{
		@Bean(name={"ds"})
		public DriverManagerDataSource getDataSource()
		{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/spring_framework");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
		}
		
		@Bean(name={"jdbctemp"})
		public JdbcTemplate getJdbcTemp()
		{
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate;
			
		}
		/*When we use Autowiring then this bean is not useful*/
		/*
		  @Bean(name= {"studentdao"}) public StudentDao getStudentDao() {
		  StudentDaoImpl studentDao = new StudentDaoImpl();
		  studentDao.setJdbctemp(getJdbcTemp()); return studentDao; }
		 */
}
