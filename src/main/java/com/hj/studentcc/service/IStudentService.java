package com.hj.studentcc.service;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.ViewCourseAndTeacher;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 16:38
 * @Description:
 */
public interface IStudentService {

    /**
     * 查询所有未选课程
     *
     * @return
     */
    List<ViewCourseAndTeacher> findAllNo(Integer id);

    /**
     * 查询所有已选课程
     *
     * @return
     */
    List<ViewCourseAndTeacher> findHave(Integer s_id);

    /**
     * 根据id退课
     *
     * @param id
     * @param s_id
     */
    void tuike(Integer id, Integer s_id);

    /**
     * 根据id选课
     *
     * @param id
     * @param s_id
     */
    void chooseCourse(Integer id, Integer s_id);

    /**
     * 根据课程id查询课程人数
     * @param id
     * @return
     */
    Integer findNum(Integer id);

    /**
     *
     * @param student
     * @return
     */
    Integer update(Student student);

}
