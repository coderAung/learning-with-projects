package ag.not.list.model.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Task {
	private int id;
	private String name;
	private String description;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private int userId;
}
