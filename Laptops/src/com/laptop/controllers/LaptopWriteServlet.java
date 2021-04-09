package com.laptop.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laptop.beans.Laptop;
import com.laptop.services.LaptopService;

/**
 * Servlet implementation class LaptopWriteServlet
 */
public class LaptopWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaptopWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Laptop lp= new Laptop();
		lp.setModelnumber(request.getParameter("modelnumber"));
		lp.setLaptop_brand(request.getParameter("laptop_brand"));
		lp.setLaptop_type(request.getParameter("laptop_type"));
		lp.setLaptop_condition(request.getParameter("laptop_condition"));
		if(request.getParameter("laptop_ssd") == null)
			lp.setLaptop_ssd(0);
		else
			lp.setLaptop_ssd(Integer.parseInt(request.getParameter("laptop_ssd")));
		if(request.getParameter("laptop_harddisk") == null)
			lp.setLaptop_harddisk(0);
		else
			lp.setLaptop_harddisk(Integer.parseInt(request.getParameter("laptop_harddisk")));
		lp.setLaptop_comment(request.getParameter("laptop_comment"));
		
		String action = request.getParameter("action");
		
		LaptopService service = new LaptopService();
		
		if(action.equals("add")) {
			service.save(lp);		
		}
		else if(action.equals("update")) {
			String idString = request.getParameter("laptop_id");
			lp.setLaptop_id(Integer.parseInt(idString));
			boolean rowUpdated= service.update(lp);
			HttpSession session = request.getSession();
			if(rowUpdated) {				
				session.setAttribute("message", "Laptop Info Updated.");
			}else {
				session.setAttribute("message", "!! something went wrong !!");
			}
		}
		response.sendRedirect(request.getContextPath()+"/laptops/list");
	}

}
