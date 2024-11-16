package ag.not.list.controller;

import java.io.IOException;

import ag.not.list.App;
import ag.not.list.model.dto.input.LoginForm;
import ag.not.list.model.service.AccountService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/login", "/logout"})
public class SecurityController extends Controller {

	private static final long serialVersionUID = 1L;
	
	private AccountService accountService;
	
	@Override
	public void init() throws ServletException {
		accountService = App.ctx.getBean(AccountService.class);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var path = req.getServletPath();
		if("/login".equals(path)) {
			view("login", req, resp);
		} else {
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var path = req.getServletPath();
		if("/login".equals(path)) {
			login(req, resp);
		} else {
			
		}
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		var email = req.getParameter("email");
		var password = req.getParameter("password");
		var loginForm = new LoginForm(email, password);
		var loginUser = accountService.login(loginForm);
		req.getSession(true).setAttribute("loginUser", loginUser);
		redirect("home", req, resp);
	}
}
