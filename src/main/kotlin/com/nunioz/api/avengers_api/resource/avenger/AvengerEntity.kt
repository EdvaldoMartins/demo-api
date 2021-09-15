package com.nunioz.api.avengers_api.resource.avenger

import com.nunioz.api.avengers_api.domain.avenger.Avenger
import javax.persistence.*

@Entity
data class AvengerEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        @Column(nullable = false)
        val nick: String,
        @Column(nullable = false)
        val person: String,
        val description: String?,
        val history: String?,
) {
    fun to() = Avenger(id, nick, person, description, history)

    companion object {
        fun from(avenger: Avenger) = AvengerEntity(
                id = avenger.id,
                nick = avenger.nick,
                person = avenger.person,
                description = avenger.description,
                history = avenger.history
        )
    }
}
