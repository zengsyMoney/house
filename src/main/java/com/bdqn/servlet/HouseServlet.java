package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.alibaba.fastjson.JSON;
import com.bdqn.pojo.House;
import com.bdqn.service.HouseService;
import com.bdqn.service.impl.HouseServiceImpl;

/**
 * Servlet implementation class HouseServlet
 */
@WebServlet("/HouseServlet")
public class HouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	HouseService hservice=new HouseServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HouseServlet() {
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
		if("selectAllHouse".equals(para)) {
			selectHouse(request, response);
		}
		
		out.flush();
		out.close();
	}
	
	private void selectHouse(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		List<House> allHouse=hservice.selectHouse();
		allHouse.forEach(System.out::println);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("allHouse", allHouse);
		String json=JSON.toJSONString(map);
		System.out.println(json);
		out.print(json);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
