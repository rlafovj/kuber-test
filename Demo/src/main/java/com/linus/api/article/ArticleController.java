package com.linus.api.article;

import com.linus.api.article.model.ArticleDTO;
import com.linus.api.article.service.ArticleService;
import com.linus.api.common.component.MessengerVO;
import com.linus.api.common.component.PageRequestVO;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
public class ArticleController {
  private final ArticleService service;

  @PostMapping("")
  public ResponseEntity<MessengerVO> save(PageRequestVO vo) throws SQLException {
    service.save(null);
    return ResponseEntity.ok(new MessengerVO());
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<MessengerVO> deleteById(@PathVariable long id) throws SQLException {
    service.deleteById(0L);
    return ResponseEntity.ok(new MessengerVO());
  }
  @GetMapping("")
  public ResponseEntity<MessengerVO> findAll(PageRequestVO vo) throws SQLException {
    service.findAll(null);
    return ResponseEntity.ok(new MessengerVO());
  }
  @GetMapping("/{id}")
  public ResponseEntity<MessengerVO> findById(PageRequestVO vo) throws SQLException {
    service.findById(0L);
    return ResponseEntity.ok(new MessengerVO());
  }
  @GetMapping("/count")
  public ResponseEntity<MessengerVO> count(PageRequestVO vo) throws SQLException {
    service.count();
    return ResponseEntity.ok(new MessengerVO());
  }
  @GetMapping("/exists/{id}")
  public ResponseEntity<MessengerVO> existsById(@PathVariable long id) throws SQLException {
    service.existsById(0L);
    return ResponseEntity.ok(new MessengerVO());
  }

//  @GetMapping("/api/all-articles")
//  public Map<?,?> findAll() throws SQLException{
//    Map<String, Object> map = new HashMap<>();
//    map.put("message", "SUCCESS");
//    @SuppressWarnings("unchecked")
//    List<ArticleDTO> list = service.findAll();
//    map.put("result", list);
//    return map;
//  }
}