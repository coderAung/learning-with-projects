package ag.not.list.model.repo.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import ag.not.list.model.entity.Task;
import ag.not.list.model.repo.TaskRepo;

@Component
public class TaskRepoImpl implements TaskRepo {
	
	private NamedParameterJdbcTemplate template;
	
	private RowMapper<Task> rowMapper;
	
	public TaskRepoImpl(DataSource dataSource) {
		template = new NamedParameterJdbcTemplate(dataSource);
		rowMapper = new BeanPropertyRowMapper<Task>(Task.class);
	}

	@Override
	public void create(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Task> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Task task) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> findByUserId(int id) {
		var sql = "select * from task where user_id = :user_id";
		return template.query(sql, 
					Map.of("user_id", id), 
					rowMapper);
	}

}
