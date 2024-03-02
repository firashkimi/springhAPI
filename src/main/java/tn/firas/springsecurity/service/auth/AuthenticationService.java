package tn.firas.springsecurity.service.auth;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.firas.springsecurity.payload.request.AuthenticationRequest;
import tn.firas.springsecurity.payload.request.RegisterRequest;
import tn.firas.springsecurity.payload.response.AuthenticationResponse;

import java.io.IOException;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
