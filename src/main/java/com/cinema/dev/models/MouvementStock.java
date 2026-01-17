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
@Table(name = "mvt_stock")
public class MouvementStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mvt", nullable = false)
    private Long id;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @Column(name = "entrant", nullable = false)
    private Boolean entrant;

    @ManyToOne
    @JoinColumn(name = "id_depot", nullable = false)
    private Depot depot;

    @OneToMany(mappedBy = "mouvementStock")
    @ToString.Exclude
    private List<MouvementStockLot> mouvementLots = new ArrayList<>();
}
