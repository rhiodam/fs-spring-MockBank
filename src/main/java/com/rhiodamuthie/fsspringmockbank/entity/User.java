package com.rhiodamuthie.fsspringmockbank.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String firstname;

    private String lastname;

    private String email;

    private String phone;

    private boolean enabled = true;

    private PrimaryAccount primaryAccount;

    private SavingsAccount savingsAccount;

    private List<Appointment> appointmentList;

    private List<Recipient> recipientList;

}
