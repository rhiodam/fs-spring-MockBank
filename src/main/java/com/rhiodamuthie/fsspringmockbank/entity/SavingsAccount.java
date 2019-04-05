package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccount {
    private int accountNumber;

    private BigDecimal accountBalance;

    private List<SavingsTransaction> savingsTransactionList;

}
