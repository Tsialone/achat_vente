package com.cinema.dev.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "caisse")
public class Caisse {

    @Id
    @Column(name = "id_caisse", nullable = false, length = 50)
    private String id;

    @Column(name = "lieu")
    private String lieu;

    @OneToMany(mappedBy = "caisse")
    @ToString.Exclude
    private List<MouvementCaisse> mouvements = new ArrayList<>();
}
