package com.ageplan.ageplan_backend_project.Roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Roles repository.
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
}