package com.cinema.dev.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_article", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false)
    private String libelle;

    @OneToMany(mappedBy = "article")
    @ToString.Exclude
    private List<ArticleCategorie> categories = new ArrayList<>();

    @OneToMany(mappedBy = "article")
    @ToString.Exclude
    private List<Lot> lots = new ArrayList<>();
}
