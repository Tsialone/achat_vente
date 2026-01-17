package com.cinema.dev.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "mvt_caisse")
public class MouvementCaisse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mvtc", nullable = false)
    private Long id;

    @Column(name = "debit", precision = 15, scale = 2)
    private BigDecimal debit;

    @Column(name = "credit", precision = 15, scale = 2)
    private BigDecimal credit;

    @Column(name = "date_", nullable = false)
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "id_paiement", nullable = false, unique = true)
    private Paiement paiement;

    @ManyToOne
    @JoinColumn(name = "id_caisse", nullable = false)
    private Caisse caisse;
}
