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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository repository;


  @Override
  public UserDTO save(UserDTO dto) {
    return entityToDto(Optional.of((repository.save(dtoToEntity(dto)))));
  }

  @Override
  public void deleteById(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<UserDTO> findAll(PageRequestVO vo) {
    //return repository.findAll(vo);
    return null;
  }

  @Override
  public Optional<UserDTO> findById(Long id) {
    return Optional.of(entityToDto(repository.findById(id)));
  }

  @Override
  public long count() {
    return repository.count();
  }

  @Override
  public boolean existsById(Long id) {
    return repository.existsById(id);
  }

  @Override
  public String updatePassword(User user) {
    throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
  }

  @Override
  public List<?> findUserByName(String name) {
    throw new UnsupportedOperationException("Unimplemented method 'findUsersByName'");  }

  @Override
  public List<?> findUserByJob(String job) {
    throw new UnsupportedOperationException("Unimplemented method 'findUsersByJob'");
  }
}
