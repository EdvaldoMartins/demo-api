package com.nunioz.api.avengers_api.application.web.resource.request

import com.nunioz.api.avengers_api.domain.avenger.Avenger
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AvengerRequest(
        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val nick: String,
        @field:NotNull
        @field:NotBlank
        @field:NotEmpty
        val person: String,
        val description: String? = null,
        val history: String? = null,
) {
    fun toAvenger() = Avenger(
            nick = nick,
            person = person,
            description = description,
            history = history)

    companion object {
        fun to(id: Long, request: AvengerRequest) = Avenger(
                id = id,
                nick = request.nick,
                person = request.person,
                description = request.description,
                history = request.history
        )
    }
}