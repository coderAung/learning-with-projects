package ag.not.list.model.service;

import java.util.List;

import ag.not.list.model.dto.output.TaskView;

public interface TaskService {

	List<TaskView> getTaskByUserId(int id);

}
