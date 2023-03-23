
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.Ordered;
import doanvat.webmvc.model.Product;
import doanvat.webmvc.service.OrderedService;
import doanvat.webmvc.service.ProductService;
import doanvat.webmvc.service.impl.OrderedServiceImpl;
import doanvat.webmvc.service.impl.ProductServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listOrderdetail", urlPatterns = {"/admin/order/list-detail"})
public class OrderdetailListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	OrderedService orderedServcie = new OrderedServiceImpl();
	ProductService productService = new ProductServiceImpl();
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		List<Ordered> orderedList = orderedServcie.getAll(); 
		req.setAttribute("orderedlist", orderedList);
		List<Product> products = new ArrayList<Product>();
		for(Ordered ordered: orderedList)
		{
			Product product = new Product();
			product = productService.get(Integer.parseInt(ordered.getProduct_id()));
			products.add(product);
		}
		req.setAttribute("products", products);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-orderdetail.jsp"); 
		dispatcher.forward(req, resp); 
	}

}
