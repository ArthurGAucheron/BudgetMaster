package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import static org.hibernate.annotations.UuidGenerator.Style.TIME;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator(style = TIME)
    @Id
    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    @NotNull
    private String password;

    private Instant createdAt;

    private Instant modifiedAt;



}
