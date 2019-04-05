package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Savings_Transaction")
public class SavingsTransaction extends BaseEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long Id;

    private Date date;

    private String description;

    private String type;

    private String status;

    private double amount;

    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "savings_account_id")
    private SavingsAccount savingsAccount;

    @Override
    public String toString() {
        return "SavingsTransaction{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", availableBalance=" + availableBalance +
                ", savingsAccount=" + savingsAccount +
                '}';
    }
}
