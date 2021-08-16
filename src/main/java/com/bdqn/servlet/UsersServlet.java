package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.pojo.House;
import com.bdqn.pojo.Users;
import com.bdqn.service.HouseService;
import com.bdqn.service.UsersService;
import com.bdqn.service.impl.HouseServiceImpl;
import com.bdqn.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsersService uservice=new UsersServiceImpl();
    HouseService hservice=new HouseServiceImpl();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String para=request.getParameter("para");
		System.out.println( para);
		if("login".equals(para)) {
			login(request, response);
		}else if("register".equals(para)) {
			register(request, response);
		}
		
		out.flush();
		out.close();
		
	}
	
	/**
	 * 注册
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("loginName");
		String password=request.getParameter("password");
		String tele=request.getParameter("tele");
		String userName=request.getParameter("userName");
		Users user=new Users(name, password, tele, userName);
		int count=uservice.register(user);
		String json="";
		if(count>0) {
			json="{\"flag\":\"yes\"}";
		}else {
			json="{\"flag\":\"注册失败\"}";
		}
		out.print(json);
	}
	
	/**
	 * 登录
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		Users users=new Users(loginName,password);
		Users user=uservice.login(users);
		String json="";
		if(user==null) {
			json="{\"flag\":\"登录失败\"}";
		}else {
			json="{\"flag\":\"yes\"}";
		}
		out.print(json);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
