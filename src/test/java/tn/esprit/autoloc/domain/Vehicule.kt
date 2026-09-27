package tn.esprit.autoloc.domain

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.math.BigDecimal

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val idVehicule: Long? = null

    @Column(nullable = false, unique = true, length = 20)
    private var immatriculation: String? = null

    @Column(nullable = false, length = 50)
    private var marque: String? = null

    @Column(nullable = false, length = 50)
    private var modele: String? = null

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private var categorie: CategorieVehicule? = null

    @Column(nullable = false, precision = 10, scale = 2)
    private var tarifJournalier: BigDecimal? = null

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private var statut: StatutVehicule? = null
}