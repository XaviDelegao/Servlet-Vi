package com.controller;

import com.dataaccess.ViDao;
import com.dataaccess.ViDaoImpl;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ViSelectionAction
 */
@WebServlet(name="ViSelectionAction", urlPatterns="/SelectVi.do")
public class ViSelectionAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViSelectionAction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String color = request.getParameter("color");
		

		ViDao viDao = new ViDaoImpl();
		


	
		List<String> marquesVi = viDao.getVinsByTipus(color);
		

		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println ("<HTML>");			
		out.println ("<BODY>");		
		out.println ("<H1>Marques de Vi suggerides</H1>");
		out.println ("<H2>Tipus: " + color + "</H2>");
		out.println (marquesVi);
		out.println ("</BODY>");
		out.println ("</HTML>");
	}

}
