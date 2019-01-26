package io.memberize.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemberizeApplication

fun main(args: Array<String>) {
    runApplication<MemberizeApplication>(*args)
}
