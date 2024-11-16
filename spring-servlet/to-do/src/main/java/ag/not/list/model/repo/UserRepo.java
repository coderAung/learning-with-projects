package ag.not.list.model.repo;

import java.util.Optional;

import ag.not.list.model.entity.User;

public interface UserRepo {
	
	void create(User user);

	Optional<User> findById(int id);

	void update(int id);
	
	boolean delete(int id);

	Optional<User> findByEmailAndPassword(String email, String password);
	
}
