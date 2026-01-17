package com.cinema.dev.models;

import java.time.LocalDateTime;
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
import jakarta.persistence.OneToOne;
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
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande", nullable = false)
    private Long id;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "id_proforma")
    private Proforma proforma;

    @OneToOne(mappedBy = "commande")
    @ToString.Exclude
    private Livraison livraison;

    @OneToMany(mappedBy = "commande")
    @ToString.Exclude
    private List<CommandeEtat> etats = new ArrayList<>();

    @OneToMany(mappedBy = "commande")
    @ToString.Exclude
    private List<Paiement> paiements = new ArrayList<>();
}
