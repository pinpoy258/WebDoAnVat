
package doanvat.webmvc.controller;

import doanvat.webmvc.model.Boardnew;
import doanvat.webmvc.model.Product;
import doanvat.webmvc.service.BoardnewService;
import doanvat.webmvc.service.ProductService;
import doanvat.webmvc.service.impl.BoardnewServicesImpl;
import doanvat.webmvc.service.impl.ProductServiceImpl;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "homePage", urlPatterns = {"/"})
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ProductService productService = new ProductServiceImpl();
	BoardnewService boardnewService = new BoardnewServicesImpl();
	DecimalFormat df = new DecimalFormat("#.000");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Boardnew> boardnewList = boardnewService.getAll();
		req.setAttribute("boardnewlist", boardnewList);
		// Product Trà sữa
		List<Product> product_trasua= productService.getProductById(1);
		req.setAttribute("product_trasua", product_trasua);	
		
		// Product Bánh Tráng
		List<Product> product_banhtrang= productService.getProductById(2);
		req.setAttribute("product_banhtrang", product_banhtrang);	
		
		// Product Cá Viên
		List<Product> product_cavien= productService.getProductById(3);
		req.setAttribute("product_cavien", product_cavien);	
		
		// Product Gỏi cuốn & gỏi đu đủ
		List<Product> product_goicuon= productService.getProductById(4);
		req.setAttribute("product_goicuon", product_goicuon);	
		
		// Product mới
		List<Product> product_new= productService.getProductById(5);
		req.setAttribute("product_new", product_new);	
				
		// Product bán chạy
		List<Product> product_banchay= productService.getProductById(6);
		req.setAttribute("product_banchay", product_banchay);	
		
		List<Product> productList = productService.getAll();
		req.setAttribute("productlist", productList);	
		//Giá giảm
		List<Product> productsList1 = new ArrayList<Product>();
		for(Product product: productList)
		{
			Product product1 = productService.get(Integer.parseInt(product.getId()));
			product1.setPrice(String.valueOf(df.format(Double.parseDouble(product.getPrice()) * (1 - (Double.parseDouble(product.getDiscount())/100)))));
			productsList1.add(product1);
			
		}

		req.setAttribute("productlist1", productsList1);
		
		// Product giảm giá
		List<Product> product_sale= productService.getProductById(7);
		req.setAttribute("product_sale", product_sale);	
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/index.jsp");
		dispatcher.forward(req, resp);
	}

}
