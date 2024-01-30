package com.ssafy.malitell.dto.request;

import com.ssafy.malitell.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardRequestDto {
    private String title;

    private String content;

    private User user;

}