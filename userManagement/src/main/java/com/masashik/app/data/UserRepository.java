package com.masashik.app.data;

import com.masashik.app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findByLastName(String lastName);
}
