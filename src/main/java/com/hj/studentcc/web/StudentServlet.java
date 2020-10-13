package com.hj.studentcc.web;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.User;
import com.hj.studentcc.pojo.ViewCourseAndTeacher;
import com.hj.studentcc.service.impl.StudentService;
import com.hj.studentcc.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 15:53
 * @Description:
 */
@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {

    /**
     * 空参构造方法
     */
    public StudentServlet() {
    }

    private String encoding;

    @Override
    public void init() throws ServletException {
        encoding = super.getServletContext().getInitParameter("encoding");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding(encoding);
        resp.setCharacterEncoding(encoding);
        resp.setContentType("text/hmtl;charset=" + encoding);

        String cmd = req.getParameter("cmd");
        if ("findAll".equals(cmd)) {
            findAll(req, resp);
        } else if ("findHave".equals(cmd)) {
            findHave(req, resp);
        } else if ("tuike".equals(cmd)) {
            tuike(req, resp);
        } else if ("chooseCourse".equals(cmd)) {
            chooseCourse(req, resp);
        } else if ("update".equals(cmd)) {
            update(req, resp);
        } else if ("findById".equals(cmd)) {
            findById(req, resp);
        }

    }

    /**
     * 修改个人信息
     *
     * @param req
     * @param resp
     */
    private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer u_id = Integer.valueOf(req.getParameter("id"));
        String s_name = req.getParameter("name");
        String s_gender = req.getParameter("gender");
        Integer s_age = Integer.valueOf(req.getParameter("age"));

        StudentService service = new StudentService();
        Student student = new Student(null, s_name, s_gender, s_age, u_id);
        Integer line = service.update(student);
        if (line > 0) {
            findById(req, resp);
        }
    }

    /**
     * 根据u_id查询个人信息
     *
     * @param req
     * @param resp
     */
    private void findById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServlet servlet = new UserServlet();
        servlet.studentMessage(req, resp);

        /**
         * 重定向到主页
         */
        resp.sendRedirect(req.getContextPath() + "/stu-show.jsp");
    }

    /**
     * 选择课程
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void chooseCourse(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        Student student = (Student) req.getSession().getAttribute("student");
        StudentService service = new StudentService();
        Integer num = service.findNum(id);
        if (num > 30) {
            req.setAttribute("teacher_msg", "<script>alert('课程人员已经达到上限！，请选择其他课程');</script>");
            findAll(req, resp);
            return;
        }
        service.chooseCourse(id, student.getS_id());
        findAll(req, resp);
    }

    /**
     * 退课
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void tuike(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        Student student = (Student) req.getSession().getAttribute("student");
        StudentService service = new StudentService();
        service.tuike(id, student.getS_id());
        findHave(req, resp);
    }

    /**
     * 通过id查询选择的课程
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void findHave(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = (Student) req.getSession().getAttribute("student");
        StudentService service = new StudentService();
        List<ViewCourseAndTeacher> view = service.findHave(student.getS_id());
        /**
         * 把数据发生到前台页面
         */
        req.setAttribute("viewCT", view);
        req.getRequestDispatcher("/stu-selected.jsp").forward(req, resp);
    }

    /**
     * 通过id查询未选择的课程
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Student student = (Student) req.getSession().getAttribute("student");
        StudentService service = new StudentService();
        List<ViewCourseAndTeacher> view = service.findAllNo(student.getS_id());
        /**
         * 把数据发生到前台页面
         */
        req.setAttribute("viewCT", view);
        req.getRequestDispatcher("/stu-noselected.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
