package com.sparta.boardfinal.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    // 댓글 작성 관련 Dto
    private String username;
    private Long contentNo;
    private String comment;
}
