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
@Table(name = "demande_achat_detail")
public class DemandeAchatDetail {

    @EmbeddedId
    private DemandeAchatDetailId id;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @ManyToOne
    @MapsId("articleId")
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @ManyToOne
    @MapsId("demandeAchatId")
    @JoinColumn(name = "id_da", nullable = false)
    private DemandeAchat demandeAchat;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class DemandeAchatDetailId {
        @Column(name = "id_article")
        private Long articleId;

        @Column(name = "id_da")
        private Long demandeAchatId;
    }
}
