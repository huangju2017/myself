package com.hj.studentcc.pojo;

import java.util.Objects;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 14:58
 * @Description:
 */
public class Teacher {

    private Integer t_id;
    private String t_name;
    private String t_gender;
    private Integer t_age;
    private Integer u_id;

    public Teacher() {
    }

    public Teacher(Integer t_id, String t_name, String t_gender, Integer t_age, Integer u_id) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_gender = t_gender;
        this.t_age = t_age;
        this.u_id = u_id;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_gender() {
        return t_gender;
    }

    public void setT_gender(String t_gender) {
        this.t_gender = t_gender;
    }

    public Integer getT_age() {
        return t_age;
    }

    public void setT_age(Integer t_age) {
        this.t_age = t_age;
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
        Teacher teacher = (Teacher) o;
        return Objects.equals(t_id, teacher.t_id) &&
                Objects.equals(t_name, teacher.t_name) &&
                Objects.equals(t_gender, teacher.t_gender) &&
                Objects.equals(t_age, teacher.t_age) &&
                Objects.equals(u_id, teacher.u_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t_id, t_name, t_gender, t_age, u_id);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_gender='" + t_gender + '\'' +
                ", t_age=" + t_age +
                ", u_id=" + u_id +
                '}';
    }
}
