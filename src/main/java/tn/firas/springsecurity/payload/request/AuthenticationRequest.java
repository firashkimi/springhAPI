package tn.firas.springsecurity.payload.request;

public record AuthenticationRequest(
        String email,
        String password
) {
}
