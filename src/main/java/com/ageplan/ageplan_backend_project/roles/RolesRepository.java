package com.ageplan.ageplan_backend_project.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface roles repository.
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
}