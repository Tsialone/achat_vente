package com.cinema.dev.models;

import java.time.LocalDate;
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
@Table(name = "inventaire")
public class Inventaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventaire", nullable = false)
    private Long id;

    @Column(name = "date_inventaire", nullable = false)
    private LocalDate dateInventaire;

    @OneToMany(mappedBy = "inventaire")
    @ToString.Exclude
    private List<InventaireDetail> details = new ArrayList<>();
}
