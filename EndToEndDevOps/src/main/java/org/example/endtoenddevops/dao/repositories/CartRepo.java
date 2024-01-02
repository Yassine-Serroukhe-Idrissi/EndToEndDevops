package org.example.endtoenddevops.dao.repositories;

import org.example.endtoenddevops.dao.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Long, Cart> {
}
