package com.sparta.boardfinal.service;

import com.sparta.boardfinal.dto.CommentRequestDto;
import com.sparta.boardfinal.model.Comment;
import com.sparta.boardfinal.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    // 코멘트 수정 기능
    // 코멘트가 수정될 때 DB에 잘 반영될 수 있도록 Transactional 부여
    @Transactional
    public Long update(Long id, CommentRequestDto requestDto) {
        Comment comment =commentRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("댓글이 없습니다.")
        );
        comment.update(requestDto);
        return comment.getId();
    }
}
