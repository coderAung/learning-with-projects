package ag.not.list;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"ag.not.list"})
public class ToDoListApp {

	@Bean
	DataSource dataSource() {
		var bean = new HikariDataSource();
		bean.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bean.setJdbcUrl("jdbc:mysql://localhost:3306/to_do");
		bean.setUsername("root");
		bean.setPassword("admin");
		return bean;
	}
}
