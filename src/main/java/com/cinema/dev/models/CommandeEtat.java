package com.cinema.dev.models;

import java.time.LocalDateTime;

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
@Table(name = "commande_etat")
public class CommandeEtat {

    @EmbeddedId
    private CommandeEtatId id;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @MapsId("commandeId")
    @JoinColumn(name = "id_commande", nullable = false)
    private Commande commande;

    @ManyToOne
    @MapsId("etatId")
    @JoinColumn(name = "id_etat", nullable = false)
    private Etat etat;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class CommandeEtatId {
        @Column(name = "id_commande")
        private Long commandeId;

        @Column(name = "id_etat")
        private Long etatId;
    }
}
