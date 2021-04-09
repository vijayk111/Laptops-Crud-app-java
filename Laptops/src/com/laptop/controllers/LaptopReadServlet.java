package com.laptop.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laptop.beans.Laptop;
import com.laptop.services.LaptopService;

/**
 * Servlet implementation class LaptopReadServlet
 */
public class LaptopReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaptopReadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		if(idString != null) {
			int id = Integer.parseInt(idString);
			LaptopService service = new LaptopService();
			Laptop laptop = service.findById(id);
			HttpSession session = request.getSession();
			session.setAttribute("laptop", laptop);
			
			request.getRequestDispatcher("/jsp/LaptopPages/update.jsp").forward(request, response);
		}else {
			String searchtype = request.getParameter("search_type");			
			String searchvalue = request.getParameter("searchString");
			if(searchtype != null) {
				LaptopService service = new LaptopService();
				if(searchtype.equals("modelnumber")) {
					ArrayList<Laptop> laptopslist = service.findByModelNumber(searchvalue);
					HttpSession session = request.getSession();
					session.setAttribute("laptopslist", laptopslist);
				}else {
					ArrayList<Laptop> laptopslist = service.findByType(searchvalue);
					HttpSession session = request.getSession();
					session.setAttribute("laptopslist", laptopslist);
				}
			}else {
				LaptopService service = new LaptopService();
				ArrayList<Laptop> laptopslist = service.findAll();
				HttpSession session = request.getSession();
				session.setAttribute("laptopslist", laptopslist);
			}
			
			request.getRequestDispatcher("../jsp/LaptopPages/displayLaptops.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
