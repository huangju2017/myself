package com.hj.studentcc.pojo;

import java.util.Objects;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 14:58
 * @Description:
 */
public class Student {

    private Integer s_id;
    private  String s_name;
    private  String s_gender;
    private Integer s_age;
    private Integer u_id;

    public Student() {

    }

    public Student(Integer s_id, String s_name, String s_gender, Integer s_age, Integer u_id) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_gender = s_gender;
        this.s_age = s_age;
        this.u_id = u_id;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_gender() {
        return s_gender;
    }

    public void setS_gender(String s_gender) {
        this.s_gender = s_gender;
    }

    public Integer getS_age() {
        return s_age;
    }

    public void setS_age(Integer s_age) {
        this.s_age = s_age;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(s_id, student.s_id) &&
                Objects.equals(s_name, student.s_name) &&
                Objects.equals(s_gender, student.s_gender) &&
                Objects.equals(s_age, student.s_age) &&
                Objects.equals(u_id, student.u_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s_id, s_name, s_gender, s_age, u_id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_gender='" + s_gender + '\'' +
                ", s_age=" + s_age +
                ", u_id=" + u_id +
                '}';
    }
}
