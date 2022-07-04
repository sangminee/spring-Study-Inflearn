package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);  // Optional : 해당 method null일 때, null 대신
    Optional<Member> findByName(String name);
    List<Member> findAll();
}