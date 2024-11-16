package ag.not.list.model.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private LocalDate createdAt;
	private LocalDate updatedAt;
}
