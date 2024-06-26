package com.linus.api.article.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Log4j2
public class ArticleDTO {
  private Long id;
  private String title;
  private String content;
//  private String registerDate;
  private Long writerId;
  private Long boardId;
}
