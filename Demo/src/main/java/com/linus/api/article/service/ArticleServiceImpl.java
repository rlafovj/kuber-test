package com.linus.api.article.service;

import com.linus.api.article.repository.ArticleRepository;
import com.linus.api.article.model.Article;
import com.linus.api.article.model.ArticleDTO;
import com.linus.api.common.component.MessengerVO;
import com.linus.api.common.component.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repo;

    @Override
    public ArticleDTO save(ArticleDTO t) {
        return entityToDto(Optional.of(repo.save(dtoToEntity(t))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<ArticleDTO> findAll(PageRequestVO vo) {
        //return repo.findAll(vo);
        return null;
    }

    @Override
    public Optional<ArticleDTO> findById(Long id) {
        return Optional.of(entityToDto(repo.findById(id)));
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repo.existsById(id);
    }

}