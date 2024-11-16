package ag.not.list.model.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskView {
	private int id;
	private String name;
	private boolean checked;
}
