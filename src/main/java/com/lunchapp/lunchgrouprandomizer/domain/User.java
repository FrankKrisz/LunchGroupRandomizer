package com.lunchapp.lunchgrouprandomizer.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Boolean isInOffice;

    @ElementCollection
    private List<String> themes = new ArrayList<>(3);
 }
