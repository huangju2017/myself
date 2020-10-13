package com.hj.studentcc.service.impl;

import com.hj.studentcc.dao.IStudentDao;
import com.hj.studentcc.dao.impl.StudentDao;
import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.ViewCourseAndTeacher;
import com.hj.studentcc.service.IStudentService;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 16:38
 * @Description:
 */
public class StudentService implements IStudentService {

    IStudentDao dao = new StudentDao();

    /**
     * 根据自己的学生id查看未选择的课程
     *
     * @param id
     * @return
     */
    @Override
    public List<ViewCourseAndTeacher> findAllNo(Integer id) {
        return dao.findAllNo(id);

    }

    /**
     * 根据id查看选择的课程
     *
     * @param id
     * @return
     */
    @Override
    public List<ViewCourseAndTeacher> findHave(Integer id) {
        return dao.findHave(id);
    }

    /**
     * 根据自己id和课程id退课
     *
     * @param id
     * @param s_id
     */
    @Override
    public void tuike(Integer id, Integer s_id) {
        dao.tuike(id, s_id);
    }

    /**
     * 根据id选课
     *
     * @param id   自己的学生id
     * @param s_id 课程id
     */
    @Override
    public void chooseCourse(Integer id, Integer s_id) {
        dao.chooseCourse(id, s_id);
    }

    @Override
    public Integer findNum(Integer id) {
        return dao.findNum(id);
    }

    @Override
    public Integer update(Student student) {
        return dao.update(student);
    }

}
