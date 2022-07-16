package com.programming.tutorial.springredditclone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "reddit_users")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;

    @NotBlank(message = "Username is required")
    @Column(name = "user_name", unique = true)
    private String username;

    @NotBlank(message = "Password is required")
    @Column(name = "password" )
    private String password;

    @Email
    @NotEmpty(message = "Email is required")
    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "created_date")
    private Instant created;

    @Column(name = "enabled")
    private boolean enabled;
}
