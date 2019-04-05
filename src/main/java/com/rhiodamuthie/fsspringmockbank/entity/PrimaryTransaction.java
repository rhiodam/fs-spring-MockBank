package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryTransaction extends BaseEntity {

    private Date date;

    private String description;

    private String type;

    private String status;

    private double amount;

    private BigDecimal availableBalance;

}
