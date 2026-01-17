package com.cinema.dev.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
@Table(name = "mvt_stock_lot")
public class MouvementStockLot {

    @EmbeddedId
    private MouvementStockLotId id;

    @ManyToOne
    @MapsId("mouvementStockId")
    @JoinColumn(name = "id_mvt", nullable = false)
    private MouvementStock mouvementStock;

    @ManyToOne
    @MapsId("lotId")
    @JoinColumn(name = "id_lot", nullable = false)
    private Lot lot;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class MouvementStockLotId {
        @Column(name = "id_mvt")
        private Long mouvementStockId;

        @Column(name = "id_lot")
        private Long lotId;
    }
}
