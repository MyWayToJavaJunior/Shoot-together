package com.github.igorf.shoot.logic.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @OneToOne
    private Profile profile;
    @NotNull
    private String firstname;
    @NotNull
    private String lastname;
    private String photo;
}