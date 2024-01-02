package org.example.endtoenddevops.mappers;

import org.example.endtoenddevops.dao.entities.User;
import org.example.endtoenddevops.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class UserMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public UserDTO fromUsertoUserDTO(User user){
        return this.modelMapper.map(user,UserDTO.class);
    }

    public User fromUserDTOToUser(UserDTO userDTO){
        return this.modelMapper.map(userDTO,User.class);
    }
}
