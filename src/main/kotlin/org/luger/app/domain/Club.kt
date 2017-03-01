package org.luger.app.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import javax.persistence.*

/**
 * Created by gerardo8 on 21/02/2017.
 */
@Entity
@Table(schema = "KOTLIN_APP", name = "CLUB")
class Club(

        @Column(nullable = false, columnDefinition = "TEXT")
        var name: String = "",

        @Column(nullable = false, columnDefinition = "TEXT")
        var country: String = "",

        @OneToMany(mappedBy = "club")
        var footballers: MutableSet<Footballer> = mutableSetOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @get:JsonProperty("_id")
        val id: Long = 0

) : Serializable {
    companion object {
        private val serialVersionUID = 2738859149330833739L
    }
}