package com.rhiodamuthie.fsspringmockbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryAccount extends BaseEntity {

    private int accountNumber;

    private BigDecimal accountBalance;

    @OneToMany(
            mappedBy = "primaryAccount",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JsonIgnore
    private List<PrimaryTransaction> primaryTransactionList;

    @Override
    public String toString() {
        return "PrimaryAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", primaryTransactionList=" + primaryTransactionList +
                '}';
    }
}
