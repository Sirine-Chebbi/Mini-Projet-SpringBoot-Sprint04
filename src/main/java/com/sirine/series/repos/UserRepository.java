package com.sirine.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sirine.series.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	User findByUsername (String username);
}
