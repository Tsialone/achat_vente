package com.cinema.dev.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "depot")
public class Depot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_depot", nullable = false)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "depot")
    @ToString.Exclude
    private List<InventaireDetail> inventaireDetails = new ArrayList<>();

    @OneToMany(mappedBy = "depot")
    @ToString.Exclude
    private List<MouvementStock> mouvements = new ArrayList<>();
}
