
package doanvat.webmvc.controller.admin;

import doanvat.webmvc.model.User;
import doanvat.webmvc.service.UserService;
import doanvat.webmvc.service.impl.UserServicesImpl;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deleteUser", urlPatterns = {"/admin/user/delete"})
public class UserDeleteController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	   
		int user_id = Integer.parseInt(req.getParameter("user-id"));
		userService.delete(user_id);	
		req.setAttribute("userList", userService.getAll());   
		RequestDispatcher dispatcherUser  = req.getRequestDispatcher("/view/admin/user.jsp");
		dispatcherUser.forward(req, resp);
	}

}
