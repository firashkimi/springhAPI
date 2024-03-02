package tn.firas.springsecurity.payload.request;

import tn.firas.springsecurity.enums.Role;

public record RegisterRequest(
        String firstname,
        String lastname,
        String email,
        String password,
        Role role
) {
}
