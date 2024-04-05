package com.linus.api.board.model;

import com.linus.api.article.model.Article;
import com.linus.api.common.BaseEntity;
import com.linus.api.user.model.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="BOARDS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Board extends BaseEntity {
    @Id
    @Column(name="ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY)
    private List<Article> article;

    @Column(name="BOARD_NAME")
    private String boardName;

    @Column(name="BOARD_TYPE")
    private String boardType;

    @Builder(builderMethodName = "builder")
    public Board(String boardName, String boardType) {
        this.boardName = boardName;
        this.boardType = boardType;
    }
}
