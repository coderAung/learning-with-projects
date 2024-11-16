package ag.not.list.controller;

import java.io.IOException;

import ag.not.list.App;
import ag.not.list.model.dto.LoginUser;
import ag.not.list.model.service.AccountService;
import ag.not.list.model.service.TaskService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/home"})
public class HomeController extends Controller {

	private static final long serialVersionUID = 1L;
	
	private AccountService accountService;
	private TaskService taskService;
	
	@Override
	public void init() throws ServletException {
		accountService = App.ctx.getBean(AccountService.class);
		taskService = App.ctx.getBean(TaskService.class);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var loginUser = (LoginUser) req.getSession(true).getAttribute("loginUser");
		
		var tasks = taskService.getTaskByUserId(loginUser.getId());
		req.setAttribute("tasks", tasks);
		template("home", req, resp);
	}
	
}
