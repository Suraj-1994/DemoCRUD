package main.decipher.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import main.decipher.dao.StudentDao;
import main.decipher.model.Student;

@Controller
@RequestMapping("/")
public class StudentController
{
   @Autowired
    StudentDao studentDao;

    @RequestMapping(value="/home")
    public String homePage(ModelMap model)
    {
        model.addAttribute("Hello", "This is Spring & Hibernate CRUD");

        return"home";
    }

    @RequestMapping(value="/register.htm", method= RequestMethod.POST)
    public ModelAndView registerData(HttpServletRequest request, Model model)
    {
        String stud_first_name=request.getParameter("stud_first_name");
        String stud_last_name=request.getParameter("stud_last_name");
        String stud_address=request.getParameter("stud_address");
        String stud_contact=request.getParameter("stud_contact");

        Student student=new Student();
        student.setStud_first_name (stud_first_name);
        student.setStud_last_name (stud_last_name);
        student.setStud_mobile_number (stud_contact);
        student.setStud_address (stud_address);


        studentDao.save(student);
        System.out.println("user registered successfully!!!");

        List<Student> studentData = studentDao.getAllStudentData();
        if(studentData != null) {
            model.addAttribute("studentList", studentData);
        }
        return new ModelAndView("studentList");

    }

    /*@RequestMapping(value = "/updateUserName", method = RequestMethod.POST)
    public User updateUserName(HttpServletRequest request, HttpServletResponse reponses, Model model) {
      User user = userDao.update();
      return user;
    }*/
    @RequestMapping(value="/students.htm")
    public String userList() {

        return "studentList";
    }
    @RequestMapping(value="/goto")
    public ModelAndView gotoStudentList(Model model) {

        List<Student> studentData = studentDao.getAllStudentData();
        if(studentData != null) {
            model.addAttribute("studentList", studentData);
        }
        return new ModelAndView("studentList");
    }

    @RequestMapping(value = "deleteStudent/{id}")
    public ModelAndView deleteStudent(HttpServletRequest request,@PathVariable("id") int id) {
        try {
            studentDao.delete(id);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return new ModelAndView("redirect:/goto");
    }
    /*update.htm*/
    @RequestMapping(value="/updateAddr")
    public ModelAndView updateRecord(HttpServletRequest request, @ModelAttribute("user") Student student)
    {
        try {
            studentDao.update(student);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("redirect:/goto");
    }


    @RequestMapping(value="/update")
    public String userList1(@RequestParam("id") int id,Model model) {
        Student student=this.studentDao.getStudent(id);
        model.addAttribute("student", student);
        return "update";
    }
}


