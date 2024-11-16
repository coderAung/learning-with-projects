package ag.not.test;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import ag.not.list.ToDoListApp;
import ag.not.list.model.entity.User;

@SpringJUnitConfig(classes = ToDoListApp.class)
public class SpringJdbcTest {
	
	@Autowired
	private DataSource dataSource;
	
	private RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
	
	@Test
	void test() {
		JdbcTemplate template = new JdbcTemplate(dataSource);

		var users = template.query("select * from user", rowMapper);
		System.out.println(users);
	}
}
