package com.cinema.dev.models;

import java.math.BigDecimal;

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
@Table(name = "proforma_detail")
public class ProformaDetail {

    @EmbeddedId
    private ProformaDetailId id;

    @Column(name = "prix", precision = 15, scale = 2, nullable = false)
    private BigDecimal prix;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @ManyToOne
    @MapsId("articleId")
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @ManyToOne
    @MapsId("proformaId")
    @JoinColumn(name = "id_proforma", nullable = false)
    private Proforma proforma;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class ProformaDetailId {
        @Column(name = "id_article")
        private Long articleId;

        @Column(name = "id_proforma")
        private Long proformaId;
    }
}
