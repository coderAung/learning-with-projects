package ag.not.list.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void template(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("pageTitle", page.toUpperCase());
		req.setAttribute("page", "%s.jsp".formatted(page));
		getServletContext()
			.getRequestDispatcher("/main.jsp")
			.forward(req, resp);
	}
	
	protected void view(String view, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext()
		.getRequestDispatcher("/view/%s.jsp".formatted(view))
		.forward(req, resp);
}
	
	protected void redirect(String path, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.sendRedirect(getServletContext().getContextPath().concat("/%s".formatted(path)));
	}
}
