package com.hj.studentcc.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 生成验证码的servlet容器<br>
 * 把生成的验证码以图片的形式发生给浏览器端，让客户查看<br>
 * 并且把生成的验证码存储到session中，方便和客户填写的验证码进行比对<br>
 */
@SuppressWarnings("serial")
@WebServlet("/validateServlet")
public class ValidateServlet extends HttpServlet {
	/**
	 * 空参构造方法
	 */
	public ValidateServlet() {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * 第一步：首先产生字符串区
		 */
		String str = "abcdefghijkmnpqrstuvwxyABCDEFGHIJKMNPQRSTUVWXY23456789";

		/**
		 * 第二步：随机生成四个字符
		 */
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			sb.append(str.charAt(getRandomNum(str.length())));
		}

		/**
		 * 第三步：把生成的字符串存入到session中，方便和用户输入的验证码比较
		 */
		req.getSession().setAttribute("validate", sb.toString());

		/**
		 * 第四步：在内存中创建出图片对象
		 */
		int width = 80;
		int height = 60;
		int imageType = BufferedImage.TYPE_INT_RGB;
		// 创建出图片对象
		BufferedImage img = new BufferedImage(width, height, imageType);

		/**
		 * 第五步：准备画笔
		 */
		Graphics g = img.getGraphics();

		g.setFont(new Font("楷体", Font.ITALIC, 24));

		for (int i = 0; i < 5; i++) {
			// 设置画笔颜色
			g.setColor(new Color(getRandomNum(255), getRandomNum(255), getRandomNum(255)));
			g.drawLine(getRandomNum(10), getRandomNum(40) + 10, getRandomNum(70), getRandomNum(40) + 10);
		}

		/**
		 * 把字符串内容写入到图片对象中
		 */
		g.drawString(sb.toString(), 20, 30);

		/**
		 * 第六步：设置响应头，就是告诉浏览器接收到的响应式图片，让浏览器介绍出该图片
		 */
		// 等同于：resp：setHeader("Content-Type","image/jpeg")
		resp.setContentType("image/jpeg");
		// 设置浏览器不缓存
		resp.setDateHeader("expries", -1);
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Pragma", "no-cache");

		/**
		 * 第七步：把图片发生到浏览器
		 */
		ImageIO.write(img, "jpg", resp.getOutputStream());

	}

	/**
	 * 产生随机数的方法
	 * 
	 * @param length
	 * @return
	 */
	private int getRandomNum(int length) {
		Random random = new Random();
		return random.nextInt(length);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
