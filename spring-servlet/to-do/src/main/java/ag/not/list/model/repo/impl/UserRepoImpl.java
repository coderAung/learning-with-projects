package ag.not.list.model.repo.impl;

import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ag.not.list.model.entity.User;
import ag.not.list.model.repo.UserRepo;

@Component
public class UserRepoImpl implements UserRepo {
	
	private NamedParameterJdbcTemplate template;
	
	private RowMapper<User> rowMapper;
	
	public UserRepoImpl(DataSource dataSource) {
		template = new NamedParameterJdbcTemplate(dataSource);
		rowMapper = new BeanPropertyRowMapper<User>(User.class);
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findById(int id) {
		
		return Optional.empty();
	}

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<User> findByEmailAndPassword(String email, String password) {
		var sql = "select * from user where email = :email and password = :password";
		var user = template.queryForObject(sql, 
					Map.of("email", email, "password", password), 
					rowMapper);
		return Optional.of(user);
	}

}
