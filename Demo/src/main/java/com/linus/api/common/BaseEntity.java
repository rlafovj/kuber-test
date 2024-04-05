package com.linus.api.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {})
@Getter
public class BaseEntity {

  @CreatedDate
  @Column(name="reg_date", updatable = false)
  private LocalDateTime regData;

  @LastModifiedDate
  @Column(name="mod_date")
  private LocalDateTime modData;
}
