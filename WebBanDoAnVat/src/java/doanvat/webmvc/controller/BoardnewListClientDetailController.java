
package doanvat.webmvc.controller;

import doanvat.webmvc.model.Boardnew;
import doanvat.webmvc.service.BoardnewService;
import doanvat.webmvc.service.impl.BoardnewServicesImpl;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listBoardnewClientDetail", urlPatterns = {"/view/client/news-list-detail"})
public class BoardnewListClientDetailController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
BoardnewService boardnewService = new BoardnewServicesImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Boardnew boardnew = boardnewService.get(Integer.parseInt(id));
		req.setAttribute("boardnew", boardnew);
		
		List<Boardnew> boardnewList = boardnewService.getAll();
		req.setAttribute("boardnewlist", boardnewList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/blog-single.jsp");
		dispatcher.forward(req, resp);
	}

}
