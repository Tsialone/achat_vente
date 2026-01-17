package com.cinema.dev.models;

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
@Table(name = "inventaire_detail")
public class InventaireDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventaire_detail", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private Integer nombre;

    @ManyToOne
    @JoinColumn(name = "id_depot", nullable = false)
    private Depot depot;

    @ManyToOne
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @ManyToOne
    @JoinColumn(name = "id_inventaire", nullable = false)
    private Inventaire inventaire;
}
