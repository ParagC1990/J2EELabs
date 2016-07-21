package com.parag;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExpLang extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bean bean = new Bean();
		bean.setKey("message");
		bean.setValue("Good Tutorial");
		//req.setAttribute("bean", bean);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/HelloWorld.jsp");
		dispatcher.forward(req	, resp);
		
	}
	
}
