package com.sparta.boardfinal.repository;

import com.sparta.boardfinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 회원 조회에 사용할 Repository
    // Username / kakao아이디로 회원 찾기 기능
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long kakaoId);
}
