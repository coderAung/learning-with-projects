package ag.not.list.model.repo;

import java.util.List;
import java.util.Optional;

import ag.not.list.model.entity.Task;

public interface TaskRepo {
	
	void create(Task task);

	Optional<Task> findById(int id);
	
	void update(Task task);
	
	boolean delete(int id);

	List<Task> findByUserId(int id);
}
