package com.possacode.banking_digital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
public class Account extends AbstractEntity  {

    private String iban;
    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;
}
