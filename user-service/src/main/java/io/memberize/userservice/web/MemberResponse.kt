package io.memberize.userservice.web

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_EMPTY)
class MemberResponse {
	var message: String? = null

	constructor()

	constructor(message: String) {
		this.message = message
	}
}
