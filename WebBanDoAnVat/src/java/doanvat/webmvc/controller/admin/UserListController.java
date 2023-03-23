
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.User;
import doanvat.webmvc.service.UserService;
import doanvat.webmvc.service.impl.UserServicesImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @WebServlet(name = "listUser", urlPatterns = {"/admin/user/list"})
public class UserListController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> users = userService.getAll();	
		req.setAttribute("userList", users);
		RequestDispatcher dispatcherUser  = req.getRequestDispatcher("/view/admin/user.jsp");
		dispatcherUser.forward(req, resp);
	}

}
