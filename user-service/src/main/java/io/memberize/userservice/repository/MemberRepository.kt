package io.memberize.userservice.repository

import io.memberize.userservice.model.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
interface MemberRepository : JpaRepository<Member, Long> {
    /**
     * Find a [Member] by email.
     *
     * @param email [String]
     * @return [Member]
     */
    fun findByEmail(@Param("email") email: String): Member?
	fun findAllByFirstName(firstName: String): List<Member?>
}
