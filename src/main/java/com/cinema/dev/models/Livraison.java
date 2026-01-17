package com.cinema.dev.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "livraison")
public class Livraison {

    @Id
    @Column(name = "id_livraison", nullable = false, length = 50)
    private String id;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "id_commande", nullable = false, unique = true)
    private Commande commande;

    @OneToOne
    @JoinColumn(name = "id_mvt", unique = true)
    private MouvementStock mouvementStock;
}
