package com.hj.studentcc.dao;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.User;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 11:18
 * @Description:
 */
public interface IUserDao {

    Integer register(User user);

    User login(User user);

    Student messageS(Integer id );

    Teacher messageT(Integer id);

    Integer addStudent(Student student);

    Integer addTeacher(Teacher teacher);

    User xiugai(Integer id, String password);
}
