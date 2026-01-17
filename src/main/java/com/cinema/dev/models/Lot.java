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
@Table(name = "lot")
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lot", nullable = false)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "qte")
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

    @OneToMany(mappedBy = "lot")
    @ToString.Exclude
    private List<MouvementStockLot> mouvements = new ArrayList<>();
}
