package io.memberize.userservice.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    var email: String? = null

    var password: String? = null

    @JsonProperty("first_name")
    var firstName: String? = null

    @JsonProperty("last_name")
    var lastName: String? = null

    constructor()

	constructor(email: String, password: String, firstName: String, lastName: String) {
        this.email = email
        this.password = password
        this.firstName = firstName
        this.lastName = lastName
    }
}
