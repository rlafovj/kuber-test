package com.linus.api.common.query;

import com.linus.api.common.component.PageRequestVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface QueryService<T> {
  List<T> findAll();
  Optional<T> findById(Long id);
  long count();
  boolean existsById(Long id);
}
