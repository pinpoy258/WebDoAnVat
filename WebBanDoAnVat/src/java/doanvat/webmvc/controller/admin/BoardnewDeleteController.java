
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.service.BoardnewService;
import doanvat.webmvc.service.impl.BoardnewServicesImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deleteBoardnew",urlPatterns = { "/admin/new/delete" })
public class BoardnewDeleteController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BoardnewService boardnewService = new BoardnewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		boardnewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/new/list");
	}

}
