package com.hj.studentcc.service;

import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.TeacherXuan;

import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 20:36
 * @Description:
 */
public interface ITeacherService {
    /**
     * 查看自己的课程
     *
     * @param t_id
     * @return
     */
    List<TeacherXuan> findAll(Integer t_id);

    /**
     * 查看没有选择的课程
     *
     * @return
     */
    List<TeacherXuan> findNo();

    /**
     * 根据id退课
     *
     * @param id
     */
    void cancel(Integer id);

    /**
     * 根据id选择授课
     *
     * @param id
     * @param t_id
     */
    void choose(Integer id, Integer t_id);

    /**
     * 更新个人信息
     *
     * @param teacher
     * @return
     */
    Integer update(Teacher teacher);
}
