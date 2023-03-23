
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.Product;
import doanvat.webmvc.model.Catalog;
import doanvat.webmvc.service.ProductService;
import doanvat.webmvc.service.CategoryService;
import doanvat.webmvc.service.impl.ProductServiceImpl;
import doanvat.webmvc.service.impl.CategoryServicesImpl;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listProduct", urlPatterns = {"/admin/product/list"})
public class ProductListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService productService = new ProductServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Product> productList = productService.getAll();
		req.setAttribute("productlist", productList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-product.jsp");
		dispatcher.forward(req, resp);
	}

}
