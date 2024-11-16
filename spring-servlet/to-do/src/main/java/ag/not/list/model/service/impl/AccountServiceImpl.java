package ag.not.list.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ag.not.list.exception.BusinessException;
import ag.not.list.model.dto.LoginUser;
import ag.not.list.model.dto.input.LoginForm;
import ag.not.list.model.repo.UserRepo;
import ag.not.list.model.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public LoginUser login(LoginForm loginForm) {
		var user = userRepo.findByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
		
		return user.map(u -> new LoginUser(u.getId(), u.getEmail(), u.getPassword()))
					.orElseThrow(() -> new BusinessException("User not found."));
	}

}
