package com.sparta.boardfinal.dto;

import lombok.Getter;

@Getter
public class ContentRequestDto {
    // 게시글 작성 관련 Dto
    private String username;
    private String title;
    private String contents;
}
