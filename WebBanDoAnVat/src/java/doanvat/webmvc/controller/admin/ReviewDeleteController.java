
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.service.ReviewService;
import doanvat.webmvc.service.impl.ReviewServicesImpl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deleteReview", urlPatterns = {"/admin/review/delete"})
public class ReviewDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReviewService reviewService =  new ReviewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		reviewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/review/list");
	}
}