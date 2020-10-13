package com.hj.studentcc.service.impl;

import com.hj.studentcc.dao.ITeacherDao;
import com.hj.studentcc.dao.impl.TeacherDao;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.TeacherXuan;
import com.hj.studentcc.service.ITeacherService;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 20:36
 * @Description:
 */
public class TeacherService implements ITeacherService {


    /**
     * 教师实现层
     */
    ITeacherDao dao =new TeacherDao();

    /**
     * 根据id查看自己选择的课程
     * @param t_id
     * @return
     */
    @Override
    public List<TeacherXuan> findAll(Integer t_id) {
        return dao.findAll(t_id);
    }

    /**
     * 查看没有老师的课程
     * @return
     */
    @Override
    public List<TeacherXuan> findNo() {
        return dao.findNo();
    }

    /**
     * 退自己选择的课程
     * @param id
     */
    @Override
    public void cancel(Integer id) {
        dao.cancel(id);
    }

    /**
     * 根据老师id，课程id选课
     * @param id
     * @param t_id
     */
    @Override
    public void choose(Integer id, Integer t_id) {
        dao.choose(id,t_id);
    }

    @Override
    public Integer update(Teacher teacher) {
        return dao.update(teacher);
    }
}
