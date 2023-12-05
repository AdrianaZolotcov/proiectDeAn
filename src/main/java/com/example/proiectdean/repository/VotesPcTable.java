package com.example.proiectdean.repository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "votes_pc")
public class VotesPcTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NAME_VAL;
    private String SURNAME;
    private int VOTES_COUNT;

}
