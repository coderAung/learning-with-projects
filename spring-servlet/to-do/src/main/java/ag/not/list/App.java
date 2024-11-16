package ag.not.list;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static AnnotationConfigApplicationContext ctx;
	
	public static void start() {
		if(null == ctx) {
			ctx = new AnnotationConfigApplicationContext(ToDoListApp.class);
		}
	}

	public static void end() {
		if(null != ctx) {
			ctx.close();
		}
	}
}
