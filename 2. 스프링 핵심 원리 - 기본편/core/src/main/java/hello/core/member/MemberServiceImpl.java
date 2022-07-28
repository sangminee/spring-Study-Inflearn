package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // 추상화에만 의존한다다
   private final MemberRepository memberRepository;

    // 생성자를 통해서 memberRepository에 어떤 구현체가 들어갈지 결정
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
