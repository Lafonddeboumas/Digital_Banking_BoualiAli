package com.possacode.banking_digital.dtO;

import com.possacode.banking_digital.model.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TransactionDto {

    private Integer id;

    private BigDecimal amount;

    private String destinationIban;

    private LocalDate transactionDate;

    private TransactionType transactionType;


}
