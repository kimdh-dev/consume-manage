package com.kdh.consumemanage.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMemberDto {
    private String username;

    private String nickname;

    private String password;

    private String passwordCheck;
}
