package com.octopus.friends.repository;

import com.octopus.friends.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 패키지명 com.octopus.friends.repository
 * 클래스명 UserRepository
 * 클래스설명 사용자 repository이다.
 * 작성일 2022-09-17
 *
 * @author 원지윤
 * @version 1.0
 * [수정내용]
 * 예시) [2022-09-17] 주석추가 - 원지윤
 */

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public Optional<User> findByUserIdEquals(String userId);
}
