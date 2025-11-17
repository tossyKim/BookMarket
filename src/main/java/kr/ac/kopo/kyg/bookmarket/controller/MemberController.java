package kr.ac.kopo.kyg.bookmarket.controller;

import jakarta.validation.Valid;
import kr.ac.kopo.kyg.bookmarket.domain.Member;
import kr.ac.kopo.kyg.bookmarket.domain.MemberFormDto;
import kr.ac.kopo.kyg.bookmarket.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/member")
public class MemberController {
    @Autowired
    MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping(value = "/add")
    public String requestAddMemberForm(Model model) {
        model.addAttribute("memberFormDto", new MemberFormDto());
        return "member/addMember";
    }

    @PostMapping(value = "/add")
    public String submitAddNewMember(MemberFormDto memberFormDto, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "member/addMember";
        }

        try {
            Member member = Member.createMember(memberFormDto, passwordEncoder);
            memberService.saveMember(member);
        }catch (IllegalStateException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "member/addMember";
        }

        return "redirect:/members";
    }

    @GetMapping(value = "/update/{memberId}")
    public String requestUpdateMemberForm(@PathVariable(name = "memberId") String memberId, Model model) {
        Member member = memberService.getMemberById(memberId);
        model.addAttribute("memberFormDto", member);
        return "member/updateMember";
    }
    @PostMapping(value = "/update")
    public String submitUpdateMember(@Valid MemberFormDto memberFormDto, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "member/updateMember";
        }
        try {
            Member member = Member.createMember(memberFormDto, passwordEncoder);
            memberService.saveMember(member);
        }catch (IllegalStateException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "member/updateMember";
        }
        return "redirect:/members";
    }

    @GetMapping(value = "/delete/{memberId}")
    public String deleteMember(@PathVariable(name = "memberId") String memberId) {
        memberService.deleteMember(memberId);
        return "redirect:/logout";
    }
}
