package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Savings_Transaction")
public class SavingsTransaction extends BaseEntity{

    private Date date;

    private String description;

    private String type;

    private String status;

    private double amount;

    private BigDecimal availableBalance;

    private SavingsAccount savingsAccount;
}
