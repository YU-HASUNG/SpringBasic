package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.OptionalIntAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test //save 동작 테스트
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        // System.out.println("result = " + (result == member)); (검증법1)
        //Assertions.assertEquals(member, result); //저장한 member이 위의 find 했을 때 나와야 하는것을 기대함. (검증법2)
        assertThat(member).isEqualTo(result);
    }
}
