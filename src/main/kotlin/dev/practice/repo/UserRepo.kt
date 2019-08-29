package dev.practice.repo

import dev.practice.entity.FinaDev
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<FinaDev, Long>