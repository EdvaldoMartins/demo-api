package com.nunioz.api.avengers_api.resource.avenger

import com.nunioz.api.avengers_api.domain.avenger.Avenger
import com.nunioz.api.avengers_api.domain.avenger.AvengerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class AvengerRepositoryImpl(
        @Autowired private val repository: AvengerEntityRepository
) : AvengerRepository {
    override fun getDetail(id: Long): Avenger? = repository.findByIdOrNull(id)?.to()

    override fun getAvengers(): List<Avenger> = repository.findAll().map { it.to() }

    override fun create(avenger: Avenger): Avenger = repository.save(AvengerEntity.from(avenger)).to()

    override fun delete(id: Long) = repository.deleteById(id)

    override fun update(avenger: Avenger): Avenger  = repository.save(AvengerEntity.from(avenger)).to()
}