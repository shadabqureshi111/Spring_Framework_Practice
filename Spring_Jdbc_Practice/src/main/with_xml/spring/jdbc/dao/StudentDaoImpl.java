package spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import spring.jdbc.entity.Student;
//@Component("studentdao") this is only use for Autowired
@Component("studentdao")
public class StudentDaoImpl implements StudentDao 
{
	@Autowired
	private JdbcTemplate jdbctemp;
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	/*insert Operation*/
	public int insert(Student student) 
	{
		String sql="Insert into student(pk_id,s_name,city)values(?,?,?)";
		int res = this.jdbctemp.update(sql,student.getId(),student.getName(),student.getCity());
		
		return res;
	}
	
	/*Update Operation*/
	public int update(Student student) 
	{
		String sql="update student set s_name=? where pk_id= ?";
		int res = this.jdbctemp.update(sql,student.getName(),student.getId());
		return res;
	}

	/*Delete Operation*/
	public int delete(int studentId) {
		String sql="delete from student where pk_id=?";
		int res = this.jdbctemp.update(sql,studentId);
		return res;
	}

	/*Select Query Operation*/
	public Student getStudent(int studentId) 
	{
		String sql="Select * from student where pk_id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		
		Student student = this.jdbctemp.queryForObject(sql,rowMapper,studentId);
		return student;
	}

	/*Query For Fetch the Detail of All Student*/
	public List<Student> getAllStudent() 
	{
		String sql="Select * from student";
		List<Student> st = this.jdbctemp.query(sql,new RowMapperImpl());
		return st;
	}
	
	
}
