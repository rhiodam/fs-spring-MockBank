package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Appointment")
public class Appointment extends BaseEntity{

    private Date date;

    private String location;

    private String deescription;

    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", location='" + location + '\'' +
                ", deescription='" + deescription + '\'' +
                ", confirmed=" + confirmed +
                ", user=" + user +
                '}';
    }
}
