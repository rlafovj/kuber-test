package com.linus.api.article.service;

import com.linus.api.article.model.Article;
import com.linus.api.article.model.ArticleDTO;
import com.linus.api.common.command.CommandService;
import com.linus.api.common.query.QueryService;

import java.util.*;

public interface ArticleService extends CommandService<ArticleDTO>, QueryService<ArticleDTO> {

  default Article dtoToEntity(ArticleDTO dto){

    return Article.builder()
            .content(dto.getContent())
            .build();
  }

  default ArticleDTO entityToDto(Optional<Article> optional){
    return optional.map(article -> ArticleDTO.builder()
            .content(article.getContent())
            .build()).orElse(null);
  }
}
