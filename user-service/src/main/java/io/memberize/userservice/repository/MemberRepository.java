package io.memberize.userservice.repository;

import io.memberize.userservice.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {
	/**
	 * Find a {@link Member} by email.
	 *
	 * @param email {@link String}
	 * @return {@link Member}
	 */
	Member findByEmail(@Param("email") String email);
}
