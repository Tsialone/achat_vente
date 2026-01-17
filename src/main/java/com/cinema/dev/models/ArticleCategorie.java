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
@Table(name = "article_categorie")
public class ArticleCategorie {

    @EmbeddedId
    private ArticleCategorieId id;

    @ManyToOne
    @MapsId("articleId")
    @JoinColumn(name = "id_article", nullable = false)
    private Article article;

    @ManyToOne
    @MapsId("categorieId")
    @JoinColumn(name = "id_categorie", nullable = false)
    private Categorie categorie;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class ArticleCategorieId {
        @Column(name = "id_article")
        private Long articleId;

        @Column(name = "id_categorie")
        private Long categorieId;
    }
}
