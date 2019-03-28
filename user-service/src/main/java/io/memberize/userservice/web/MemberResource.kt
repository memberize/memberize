package io.memberize.userservice.web

import io.memberize.userservice.model.Member
import io.memberize.userservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/member")
class MemberResource(
	@Autowired
	private val userService: UserService
) {
	@PutMapping
	fun createMember(@RequestBody member: Member): ResponseEntity<Member> {
		return ResponseEntity.ok(userService.save(member)!!)
	}
}
