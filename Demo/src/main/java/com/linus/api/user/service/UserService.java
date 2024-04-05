package com.linus.api.user.service;


import com.linus.api.common.command.CommandService;
import com.linus.api.common.query.QueryService;
import com.linus.api.user.model.User;
import com.linus.api.user.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommandService<UserDTO>, QueryService<UserDTO> {
  //command
  String updatePassword(User user);
  //query
  List<?> findUserByName(String name);
  List<?> findUserByJob(String job);
  default User dtoToEntity(UserDTO dto){
    return User.builder()

            .build();
  }

  default UserDTO entityToDto(Optional<User> optional){
    return UserDTO.builder()

            .build();
  }
}
