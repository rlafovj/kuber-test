package com.linus.api.common.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesVO {
  private boolean enabled;
  private String location;
  private String maxFileSize;
  private String maxRequestSize;
  private String fileSizeThreshold;

}
