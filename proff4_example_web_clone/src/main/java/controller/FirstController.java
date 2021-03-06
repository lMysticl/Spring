package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ServiceProduct;
import service.ServiceProductImpl;

public class FirstController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServiceProduct serviceProduct = new ServiceProductImpl();
		request.setAttribute("products", serviceProduct.getAllProducts());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/first.jsp");
		dispatcher.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str = req.getParameter("polk");
		System.out.println("str="+str);
		doGet(req, resp);
		
	}
}
