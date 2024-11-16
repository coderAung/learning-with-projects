package ag.not.list;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextInitServlet implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		sce.getServletContext().setAttribute("app", "To Do");
		
		App.start();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		App.end();
	}
}
