package com.kdh.consumemanage.member.controller;

import com.kdh.consumemanage.member.dto.CreateMemberDto;
import com.kdh.consumemanage.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/signup")
    public String signupGet(CreateMemberDto createMemberDto) {
        return "member/signup";
    }

    @PostMapping("/signup")
    public String signup(CreateMemberDto createMemberDto, BindingResult bindingResult) {
        if(!createMemberDto.getPassword().equals(createMemberDto.getPasswordCheck())) {
            bindingResult.rejectValue("passwordCheck", "passwordIncorrect", "패스워드가 일치하지 않습니다.");
            return "member/signup";
        }

        memberService.createMember(createMemberDto);

        return "redirect:/";
    }
}
