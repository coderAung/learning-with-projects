package ag.not.list.model.service;

import ag.not.list.model.dto.LoginUser;
import ag.not.list.model.dto.input.LoginForm;

public interface AccountService {

	LoginUser login(LoginForm loginForm);

}
