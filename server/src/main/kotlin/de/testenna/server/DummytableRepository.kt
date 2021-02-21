package de.testenna.server

import org.springframework.cache.annotation.Cacheable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface  DummytableRepository : JpaRepository<JpaDummytable, Long> {
}
