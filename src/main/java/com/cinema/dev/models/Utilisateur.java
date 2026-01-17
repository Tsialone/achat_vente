package com.cinema.dev.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur", nullable = false)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;

    @Column(name = "date_embauche")
    private LocalDate dateEmbauche;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "id_dept", nullable = false)
    private Dept dept;
}
