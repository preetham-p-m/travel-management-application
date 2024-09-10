package com.pmp.travel_management_application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user_details")
@ToString(callSuper = true)
public class User extends AbstractPersistableEntity {
    private static final long serialVersionUID = 1L;

    @Convert(converter = StringTrimConverter.class)
    @Column(nullable = false, updatable = false, unique = true, length = 100)
    @NotNull
    @Size(max = 100)
    private String userName;

    @Convert(converter = StringTrimConverter.class)
    @Column(nullable = false)
    @NotNull
    private String name;

    private String password;

    @Convert(converter = StringTrimConverter.class)
    @Column(nullable = false, unique = true)
    @NotNull
    @Email
    private String email;
}