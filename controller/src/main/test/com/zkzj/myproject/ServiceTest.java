package com.zkzj.myproject;

import com.zkzj.myproject.model.Student;
import com.zkzj.myproject.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: service测试类
 * @author: chenwt
 * @create: 2018-03-26 00:20
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class ServiceTest {
    @Resource
    private StudentService studentService;
    @Test
    public void addTest() throws Exception {
        Student student=new Student();
//        student.setId(new Integer("1"));
        student.setName("王同学");
        student.setSex(false);
        student.setAddress("中国钓鱼岛");
        System.out.println(studentService.addStudent(student));
    }
    @Test
    public void deleteTest()throws Exception{
        System.out.println(studentService.deleteStudentById(1));

    }
    @Test
    public void updateTest()throws Exception{
        Student student=new Student();
        student.setId(new Integer("4"));
        student.setAddress("中国");
        System.out.println(studentService.updateStudentById(student));
    }
    @Test
    public void select()throws Exception{
//        Student student=new Student();
//        student.setId(new Integer("1"));
        List<Student> list=(List<Student>)studentService.findAllStudent(null).getResult();
        for (Student s:list){
            System.out.println(s.toString());
        }

    }
}