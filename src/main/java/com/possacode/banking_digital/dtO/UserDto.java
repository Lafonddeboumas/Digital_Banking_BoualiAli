package com.possacode.banking_digital.dtO;

import com.possacode.banking_digital.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDto {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    static UserDto fromEntity(User user){
        return UserDto.builder()
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    static User toEntity(UserDto userDto){
        return User.builder()
                .firstname(userDto.getFirstname())
                .lastname(userDto.getLastname())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
    }
}
