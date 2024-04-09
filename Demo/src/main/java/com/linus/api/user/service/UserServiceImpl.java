package com.linus.api.user.service;

import com.linus.api.common.component.MessengerVO;
import com.linus.api.common.component.PageRequestVO;
import com.linus.api.user.model.User;
import com.linus.api.user.model.UserDTO;
import com.linus.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository repo;


  @Override
  public MessengerVO save(UserDTO dto) {
    entityToDto(repo.save(dtoToEntity(dto)));
    return new MessengerVO();
  }

  @Override
  public MessengerVO deleteById(Long id) {
    repo.deleteById(id);
    return new MessengerVO();
  }

  @Override
  public MessengerVO modify(UserDTO userDTO) {
    return null;
  }

  @Override
  public List<UserDTO> findAll() {
    return repo.findAll().stream().map(i->entityToDto(i)).toList();
  }

  @Override
  public Optional<UserDTO> findById(Long id) {
    //Optional.of(entityToDto(repo.findById(id)));
    return null;
  }

  @Override
  public MessengerVO login(UserDTO param) {
    throw new UnsupportedOperationException("Unimplemented method 'login'");
  }

  @Override
  public long count() {
    return repo.count();
  }

  @Override
  public boolean existsById(Long id) {
    return repo.existsById(id);
  }

  @Override
  public List<UserDTO> findUsersByName(String name) {
    throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");
  }

  @Override
  public List<UserDTO> findUsersByJob(String job) {
    throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
  }

  @Override
  public Optional<User> findUserByUsername(String username) {
    return repo.findByUsername(username);
  }
}
