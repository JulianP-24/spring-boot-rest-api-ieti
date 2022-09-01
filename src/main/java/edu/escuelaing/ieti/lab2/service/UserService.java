package edu.escuelaing.ieti.lab2.service;

import edu.escuelaing.ieti.lab2.dto.UserDto;
import edu.escuelaing.ieti.lab2.entities.User;

import java.util.List;

public interface UserService {
    User create(User user );
    User findById( String id );
    List<User> getAll();
    void deleteById( String id );
    User update( User user, String userId );
    UserDto mapToDto(User user);
    User mapToEntity(UserDto userDto);
}
