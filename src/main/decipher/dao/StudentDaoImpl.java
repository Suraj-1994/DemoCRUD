package main.decipher.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.decipher.model.Student;

@Transactional
@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    SessionFactory sessionFactory;
    public Session getCurrentSession()
    {
        return this.sessionFactory.getCurrentSession();
    }


    public void save(Student student)
    {
        Session session=this.getCurrentSession();
        session.save(student);
    }
    @Override
    public void update(Student student) {
        Session session = this.sessionFactory.getCurrentSession();


     /*      Query query = session.createQuery("update User set address =:addr where id = :uid ");
        query.setString("addr", addr);
        query.setString(addr, addr);
        int result = query.executeUpdate();
     */
        session.update(student);
    }
    @Override
    public void delete(int studentId) {
        Student student = (Student) sessionFactory.getCurrentSession().load(
                Student.class, studentId);
        if (null != student) {
            this.sessionFactory.getCurrentSession().delete(student);
        }

    }
    @Override
    public List<Student> getAllStudentData()
    {
        try {

            Session session=this.getCurrentSession();
            Query query=session.createQuery("from Student");
            List<Student> list=query.list();

            return list;

        }catch(Exception exp)
        {
            exp.printStackTrace();
            return null;
        }
    }
    @Override
    public Student getStudent(int id) {
        return (Student) this.sessionFactory.getCurrentSession().get(Student.class, id);
    }
}
