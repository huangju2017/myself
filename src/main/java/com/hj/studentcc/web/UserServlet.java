package com.hj.studentcc.web;

import com.hj.studentcc.pojo.Student;
import com.hj.studentcc.pojo.Teacher;
import com.hj.studentcc.pojo.User;
import com.hj.studentcc.service.IUserService;
import com.hj.studentcc.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: HuangJu
 * @Date: 2020/9/26 10:35
 * @Description:
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {


    /**
     * 空参构造方法
     */
    public UserServlet() {
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


        if ("register".equals(cmd)) {
            register(req, resp);
        } else if ("login".equals(cmd)) {
            login(req, resp);
        } else if ("logout".equals(cmd)) {
            logout(req, resp);
        } else if ("message".equals(cmd)) {
            message(req, resp);
        } else if ("xiugai".equals(cmd)) {
            xiugai(req, resp);
        }

    }

    /**
     * 修改密码
     *
     * @param req
     * @param resp
     */
    private void xiugai(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String password = req.getParameter("newPassword");
        System.out.println(password + "" + id);
        UserService service = new UserService();

        User user = service.xiugai(id, password);
        System.out.println(user);
        /**
         * 修改成功之后,我们要把该用户重修存储到session中
         */
        req.getSession().setAttribute("user", user);

        resp.getWriter().write("修改成功，1s后回到主页，重修登录...");
        resp.setHeader("refresh", "1,url=/studentcc_war_exploded/login.jsp");

    }

    /**
     * 完善个人信息
     *
     * @param req
     * @param resp
     */
    private void message(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        User user = (User) req.getSession().getAttribute("user");

        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        Integer age = Integer.valueOf(req.getParameter("age"));

        UserService service = new UserService();
        Integer status = user.getStatus();
        if (status == 0) {
            Student student = new Student(null, name, gender, age, user.getId());
            Integer line = service.addStudent(student);
            if (line > 0) {
                req.getSession().setAttribute("student", student);

                /**
                 * 重定向到主页
                 */
                resp.sendRedirect(req.getContextPath() + "/stu-index.jsp");
            }
        } else {
            Teacher teacher = new Teacher(null, name, gender, age, user.getId());
            Integer line = service.addTeacher(teacher);
            if (line > 0) {
                req.getSession().setAttribute("teacher", teacher);
                /**
                 * 重定向到主页
                 */
                resp.sendRedirect(req.getContextPath() + "/tea-index.jsp");
            }
        }
    }

    /**
     * 安全退出用户
     *
     * @param req
     * @param resp
     */
    private void logout(HttpServletRequest req, HttpServletResponse resp) {
        /**
         * 清除session
         */
        req.getSession().invalidate();

        /**
         * 重定向到主页
         */
        try {
            resp.sendRedirect(req.getContextPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Integer status = Integer.valueOf(req.getParameter("status"));

        UserService service = new UserService();
        User user = new User(null, username, password, status);
        User u = service.login(user);
        try {
            if (u == null) {
                req.setAttribute("login_msg", "账号密码有误，请检查后登录");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
                return;
            }
            /**
             * 登录成功之后,我们要把该登录的用户存储到session中
             */
            req.getSession().setAttribute("user", u);

            if (status == 0) {
                studentMessage(req, resp);
                /**
                 * 重定向到主页
                 */
                resp.sendRedirect(req.getContextPath() + "/stu-index.jsp");
                return;

            } else {
                teacherMessage(req, resp);
                /**
                 * 重定向到主页
                 */
                resp.sendRedirect(req.getContextPath() + "/tea-index.jsp");
                return;
            }

        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 教师登录时，查询教师信息是否完全
     * 不完全则补全
     *
     * @param req
     * @param resp
     */
    protected void teacherMessage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        UserService service = new UserService();
        Teacher teacher = service.messageT(user.getId());
        if (teacher == null) {
            req.getRequestDispatcher("/massage.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("teacher", teacher);

        }
    }

    /**
     * 学生登录时，查询学生信息是否完全
     * 不完全则补全
     *
     * @param req
     * @param resp
     */
    protected void studentMessage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = (User) req.getSession().getAttribute("user");
        UserService service = new UserService();
        Student student = service.messageS(user.getId());
        if (student == null) {
            req.getRequestDispatcher("/massage.jsp").forward(req, resp);
        } else {
            req.getSession().setAttribute("student", student);


        }
    }


    /**
     * 用户登录功能
     *
     * @param req
     * @param resp
     */
    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Integer status = Integer.valueOf(req.getParameter("status"));

        /**
         * 比较验证码是否正确，<br>
         * 后期使用ajax异步验证
         */
        // 获取客户输入的验证码
        String validateStr = req.getParameter("validateStr");
        // 获取服务器中产生的验证码
        String validate = (String) req.getSession().getAttribute("validate");

        if (!validate.equals(validateStr)) {
            req.setAttribute("validate_msg", "验证码有误，请重新输入");
            // 转发
            try {
                req.getRequestDispatcher("/register.jsp").forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        IUserService service = new UserService();
        User user = new User(null, username, password, status);

        if (username != null && password != null) {
            Integer line = service.register(user);
            if (line > 0) {
                resp.getWriter().write("注册成功，3s后回到主页...");
                resp.setHeader("refresh", "3,url=/studentcc_war_exploded/login.jsp");
            }
        } else {
            req.setAttribute("register_msg", "注册失败，请检查数据");
            // 转发到主页页面
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
