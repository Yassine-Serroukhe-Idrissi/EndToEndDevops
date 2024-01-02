package org.example.endtoenddevops.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Cart {
    @Id
    private Long id;
    private String type;
    private Float totalPrice;
}
