package com.zkzj.myproject.service.impl;/**
 * Created with IntelliJ IDEA.
 * ProjectName:myproject
 * Description:
 * User: chenwt
 * Date: 2018-03-26:0:00
 */

import com.zkzj.myproject.dao.StudentDao;
import com.zkzj.myproject.model.Student;
import com.zkzj.myproject.model.utils.ResultVo;
import com.zkzj.myproject.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: sv实现类
 * @author: chenwt
 * @create: 2018-03-26 00:00
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudentById(Integer id) {
        Student student=new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }

    public ResultVo findAllStudent(Student student) {
        ResultVo resultVo=new ResultVo();
        List<Student> list= studentDao.select(student);
        if (list.size()>0){
            resultVo.setResult(list);
            resultVo.isSuccess(true);
        }else {resultVo.setMessage("没有找到相关信息");}
        return resultVo;
    }
}
