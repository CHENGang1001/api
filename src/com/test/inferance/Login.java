package com.test.inferance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	private String s ="{\r\n" + 
			"    \"code\"\r\n" + 
			":\r\n" + 
			"    0\r\n" + 
			"        , \"msg\"\r\n" + 
			":\r\n" + 
			"    \"登入成功\"\r\n" + 
			"        , \"data\"\r\n" + 
			":\r\n" + 
			"    {\r\n" + 
			"        \"access_token\"\r\n" + 
			"    :\r\n" + 
			"        \"c262e61cd13ad99fc650e6908c7e5e65b63d2f32185ecfed6b801ee3fbdd5c0a\"\r\n" + 
			"    }\r\n" + 
			"}";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = null;
		if (username!=null||password!=null) {
			if (username.equals("运维用户")&&password.equals("123456")) {
				try {
				    out = response.getWriter();
				    out.write(s);
				} catch (IOException e) {
				    e.printStackTrace();
				} finally {
				    if (out != null) {
				        out.close();
				    }
				}
			}
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
