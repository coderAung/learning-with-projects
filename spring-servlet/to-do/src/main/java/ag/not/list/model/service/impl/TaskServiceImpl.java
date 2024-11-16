package ag.not.list.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ag.not.list.model.dto.output.TaskView;
import ag.not.list.model.repo.TaskRepo;
import ag.not.list.model.service.TaskService;

@Component
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public List<TaskView> getTaskByUserId(int id) {
		var tasks = taskRepo.findByUserId(id);
		if(null != tasks && tasks.size() > 0) {
			return tasks.stream().map(task -> 
						new TaskView(task.getId(), task.getName(), false)
					).toList();
		}
		return null;
	}

}
