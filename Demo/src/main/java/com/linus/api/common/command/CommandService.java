package com.linus.api.common.command;

import com.linus.api.common.component.MessengerVO;

public interface CommandService<T> {
  T save(T t);
  void deleteById(Long id);
}
