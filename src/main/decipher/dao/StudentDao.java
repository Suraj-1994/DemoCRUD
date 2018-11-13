package main.decipher.dao;

import java.util.List;
import main.decipher.model.Student;

public interface StudentDao {

    public void save(Student student);
    public void update(Student student);
    public void delete(int uid);
    public Student getStudent(int id);
    public List<Student> getAllStudentData();
}
