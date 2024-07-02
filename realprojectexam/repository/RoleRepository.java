package org.blog.oauthexam.realprojectexam.repository;

import org.blog.oauthexam.realprojectexam.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    public Role findByName(String name);
}
