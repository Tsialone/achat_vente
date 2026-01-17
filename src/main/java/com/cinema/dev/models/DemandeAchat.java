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
@Table(name = "demande_achat")
public class DemandeAchat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_da", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "demandeAchat")
    @ToString.Exclude
    private List<DemandeAchatDetail> details = new ArrayList<>();

    @OneToMany(mappedBy = "demandeAchat")
    @ToString.Exclude
    private List<Proforma> proformas = new ArrayList<>();
}
