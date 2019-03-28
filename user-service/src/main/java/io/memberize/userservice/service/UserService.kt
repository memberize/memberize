package io.memberize.userservice.service

import io.memberize.userservice.model.Member
import io.memberize.userservice.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService(
	@Autowired
	private val repository: MemberRepository
) {
	fun save(member: Member): Member? {
		return repository.save(member)
	}
}
