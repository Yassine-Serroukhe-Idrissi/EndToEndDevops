package org.example.endtoenddevops.dao.repositories;

import org.example.endtoenddevops.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
