
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.Catalog;
import doanvat.webmvc.service.CategoryService;
import doanvat.webmvc.service.impl.CategoryServicesImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listCategory", urlPatterns = {"/admin/cate/list"})
public class CategoryListController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CategoryService cateService = new CategoryServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Catalog> cateList = cateService.getAll();
		req.setAttribute("catelist", cateList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-cate.jsp");
		dispatcher.forward(req, resp);
	}

}
