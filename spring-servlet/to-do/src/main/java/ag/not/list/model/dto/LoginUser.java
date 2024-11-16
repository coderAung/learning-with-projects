package ag.not.list.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginUser {
	private int id;
	private String name;
	private String email;
}
