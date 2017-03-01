package org.luger.app.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.persistence.*

/**
 * Created by gerardo8.
 */

@Entity
@Table(schema = "KOTLIN_APP", name = "FOOTBALLER")
class Footballer (

        @Column(nullable = false, columnDefinition = "TEXT")
        var name: String = "",

        @Column(nullable = false, columnDefinition = "TEXT")
        var nickname: String = "",

        @Column(name = "BIRTH_DATE", nullable = false)
        var birthDate: LocalDate = LocalDate.now(),

        @Column(name = "BIRTH_PLACE", nullable = false, columnDefinition = "TEXT")
        var birthPlace: String = "",

        @Column(name = "PLAYING_POSITION", nullable = false, columnDefinition = "TEXT")
        var playingPosition: String = "",

        @ManyToOne
        @JoinColumn(name = "CLUB_ID", referencedColumnName = "ID")
        var club: Club? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @get:JsonProperty("_id")
        val id: Long = 0

) : Serializable {

    companion object {
        private val serialVersionUID = 2738859149330833739L
    }

    fun getAge() : Int = ChronoUnit.YEARS.between(birthDate, LocalDate.now()).toInt()

}