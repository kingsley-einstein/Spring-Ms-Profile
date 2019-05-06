package com.spring.microservice.eureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@Entity
@Table(name = "profiles")
public class Profile implements java.io.Serializable {
    @Id
    @Column(name = "userId", nullable = false, unique = true)
    private Long id;

    @NotEmpty(message = "Name is required")
    @Column(name = "name", nullable = false)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dob", columnDefinition = "timestamp")
    private Date dob;

    @Column(name = "occupation")
    private String occupation;

    public Profile() {}
}