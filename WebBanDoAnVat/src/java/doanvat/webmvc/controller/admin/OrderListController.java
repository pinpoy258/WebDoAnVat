
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.Transactions;
import doanvat.webmvc.service.TransactionService;
import doanvat.webmvc.service.impl.TransactionServicesImpl;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listOrder", urlPatterns = {"/admin/order/list"})
public class OrderListController extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	TransactionService transactionService = new TransactionServicesImpl(); 
 
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		List<Transactions> transactionList = transactionService.getAll(); 
		req.setAttribute("order", transactionList); 
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-order.jsp"); 
		dispatcher.forward(req, resp); 
	} 

}
