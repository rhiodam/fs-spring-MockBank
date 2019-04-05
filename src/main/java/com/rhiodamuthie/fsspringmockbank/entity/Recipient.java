package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RECIPIENT")
public class Recipient extends BaseEntity{

    private String name;

    private String email;

    private String phone;

    private String accountNumber;

    private String description;

    private User user;
}
