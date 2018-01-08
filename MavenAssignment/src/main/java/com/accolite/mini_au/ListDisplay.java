package com.accolite.mini_au;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListDisplay
 */
public class ListDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int id;
    /**
     * Default constructor. 
     */
    public ListDisplay() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id_ = request.getParameter("id");
		id = Integer.parseInt(id_);
		ListName ln = new ListName();
		ln.insert();
		String name = ln.getName(id);
		request.setAttribute("response","The entered id belongs to: "+ name);
		request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
