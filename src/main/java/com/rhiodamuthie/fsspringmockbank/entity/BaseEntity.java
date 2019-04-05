package com.rhiodamuthie.fsspringmockbank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
//@Entity
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false , updatable = false)
    private Long id;

//    @Column(name = "")
    private Date createdAt = new Date();

    private Date updatedAt;

    private String createdBy;

    private Date updatedBy;

    @Version
    private Integer version;

}
