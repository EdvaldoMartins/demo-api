package com.nunioz.api.avengers_api.resource.avenger

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long> {

}