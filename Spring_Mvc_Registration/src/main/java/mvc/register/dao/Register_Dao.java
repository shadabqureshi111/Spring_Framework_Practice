/*
 * package mvc.register.dao;
 * 
 * import java.io.Serializable;
 * 
 * import javax.transaction.Transactional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.orm.hibernate5.HibernateTemplate; import
 * org.springframework.stereotype.Component; import
 * org.springframework.stereotype.Repository;
 * 
 * import mvc.register.entity.Register_Entity;
 * 
 * @Repository public class Register_Dao {
 * 
 * @Autowired private HibernateTemplate hibernateTemplate;
 * 
 * @Transactional public int insert(Register_Entity reg) { int i = (Integer)
 * this.hibernateTemplate.save(reg); return i; } }
 */