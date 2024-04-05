package com.linus.api.board.service;

import com.linus.api.article.model.ArticleDTO;
import com.linus.api.board.model.Board;
import com.linus.api.board.model.BoardDTO;
import com.linus.api.board.repository.BoardRepository;
import com.linus.api.common.component.MessengerVO;
import com.linus.api.common.component.PageRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repo;

    @Override
    public BoardDTO save(BoardDTO dto) {
        return entityToDto(Optional.of(repo.save(dtoToEntity(dto))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<BoardDTO> findAll(PageRequestVO vo) {
        //return repo.findAll(vo);
        return null;
    }

    @Override
    public Optional<BoardDTO> findById(Long id) {
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
