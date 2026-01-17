package com.cinema.dev.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "proforma")
public class Proforma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proforma", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_da", nullable = false)
    private DemandeAchat demandeAchat;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_fournisseur", nullable = false)
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "proforma")
    @ToString.Exclude
    private List<ProformaDetail> details = new ArrayList<>();

    @OneToMany(mappedBy = "proforma")
    @ToString.Exclude
    private List<ProformaEtat> etats = new ArrayList<>();

    @OneToMany(mappedBy = "proforma")
    @ToString.Exclude
    private List<Commande> commandes = new ArrayList<>();
}
