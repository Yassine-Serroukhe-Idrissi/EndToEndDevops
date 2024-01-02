package org.example.endtoenddevops.dtos;

import lombok.*;

@Data
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
}

