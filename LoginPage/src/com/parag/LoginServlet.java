
package com.parag;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String username = req.getParameter("Username"); 
			String password = req.getParameter("Password"); 
			if(username.length() > 5){
				resp.getWriter().println("Please enter valid Username");}
			else if(password.length() > 5)
				{resp.getWriter().println("Please enter valid Password");
			return;}
			else
			{
				
				
				resp.getWriter().printf("Welcome %s", username);
				Cookie cookie = new Cookie("username", username);
				cookie.setMaxAge(3600);
				resp.addCookie(cookie);
				
				
			}
			
		}
}
