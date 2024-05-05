package com.sirine.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sirine.series.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);
}
