package com.cinema.dev.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "paiement")
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paiement", nullable = false)
    private Long id;

    @Column(name = "montant", precision = 15, scale = 2, nullable = false)
    private BigDecimal montant;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "id_commande", nullable = false)
    private Commande commande;

    @OneToOne(mappedBy = "paiement")
    @ToString.Exclude
    private MouvementCaisse mouvementCaisse;
}
