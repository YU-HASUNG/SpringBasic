package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository { //repository의 4가지 기능 생성
    Member save(Member member); //save 회원 저장 기능
    Optional<Member> findById(Long id); //저장소에서 ID를 찾아오는 기능
    Optional<Member> findByName(String name); //저장소에서 Name을 찾아오는 기능
    List<Member> findAll(); //저장된 모든 회원 리스트 반환 기능
}
