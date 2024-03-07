package com.possacode.banking_digital.dtO;

import com.possacode.banking_digital.model.Contact;
import com.possacode.banking_digital.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ContactDto {

    private Integer id;
    private String firstname;

    private String lastname;

    private String email;

    private String iban;
    private Integer userId;

    public static ContactDto fromEntity(Contact contact){
        return ContactDto.builder()
                .id(contact.getId())
                .firstname(contact.getFirstname())
                .lastname(contact.getLastname())
                .email(contact.getEmail())
                .iban(contact.getIban())
                .userId(contact.getUser().getId())
                .build();
    }

    public static Contact fromEntity(ContactDto contactDto){
        return Contact.builder()
                .id(contactDto.getId())
                .firstname(contactDto.getFirstname())
                .lastname(contactDto.getLastname())
                .email(contactDto.getEmail())
                .iban(contactDto.getIban())
                .user(
                        User.builder()
                                .id(contactDto.getId())
                                .build())
                .build();
    }
}
