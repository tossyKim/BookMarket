package kr.ac.kopo.kyg.bookmarket.service;

import jakarta.transaction.Transactional;
import kr.ac.kopo.kyg.bookmarket.domain.Member;
import kr.ac.kopo.kyg.bookmarket.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {
    private final MemberRepository memberRepository;

    public Member saveMember(Member mamber){
        validateDuplicateMember(mamber);
        return memberRepository.save(mamber);
    }

    public Member getMemberById(String memberId){
        return memberRepository.findByMemberId(memberId);
    }

    public void deleteMember(String memberId){
        Member member = memberRepository.findByMemberId(memberId);
        memberRepository.deleteById(member.getNum());
    }

    private void validateDuplicateMember(Member member){
        Member findMember = memberRepository.findByMemberId(member.getMemberId());
        if(findMember != null){
            throw new IllegalStateException("Duplicate member found");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {
        Member member = memberRepository.findByMemberId(memberId);
        if(member == null){
            throw new UsernameNotFoundException("User not found");
        }
        UserDetails userDetails = User.builder()
                .username(member.getMemberId())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
        return userDetails;
    }
}
