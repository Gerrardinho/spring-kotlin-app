package org.luger.app.repository

import org.luger.app.domain.Club
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by gerardo8 on 21/02/2017.
 */
interface ClubRepository : JpaRepository<Club, Long> {
}