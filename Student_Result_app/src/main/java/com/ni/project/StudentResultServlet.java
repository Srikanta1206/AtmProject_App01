package com.ni.project;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class StudentResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public StudentResultServlet() {
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int roll=Integer.parseInt(request.getParameter("roll"));
		ResultDAO rdao=new ResultDAO();
		ResultBean rb=rdao.getResult(roll);
		request.setAttribute("result", rb);
		RequestDispatcher rd=request.getRequestDispatcher("/Result.jsp");
		rd.forward(request, response);
		
	}

}
