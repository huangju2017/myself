package com.hj.studentcc.dao;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.ViewCourseAndTeacher;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 16:38
 * @Description:
 */
public interface IStudentDao {
    List<ViewCourseAndTeacher> findAllNo(Integer id);

    List<ViewCourseAndTeacher> findHave(Integer id);

    void tuike(Integer id, Integer s_id);

    void chooseCourse(Integer id, Integer s_id);

    Integer findNum(Integer id);

    Integer update(Student student);
}
