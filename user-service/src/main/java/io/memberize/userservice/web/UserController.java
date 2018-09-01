package io.memberize.userservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @GetMapping
    public ResponseEntity<UserResponse> testRoute() {
        return new ResponseEntity<>(new UserResponse("Success!"), HttpStatus.OK);
    }
}
