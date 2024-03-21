package com.ageplan.ageplan_backend.Roles;

import com.ageplan.ageplan_backend.Roles.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Roles repository.
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
}