package tn.firas.springsecurity.controller.auth;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.firas.springsecurity.controller.api.AuthenticationApi;
import tn.firas.springsecurity.payload.request.AuthenticationRequest;
import tn.firas.springsecurity.payload.request.RegisterRequest;
import tn.firas.springsecurity.payload.response.AuthenticationResponse;
import tn.firas.springsecurity.service.auth.AuthenticationService;

import java.io.IOException;


@RestController
@RequiredArgsConstructor
public class AuthenticationController implements AuthenticationApi {

    private final AuthenticationService service;


    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody @Valid RegisterRequest request
    ) {

        return ResponseEntity.ok(service.register(request));
    }

    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }


    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        service.refreshToken(request, response);
    }


}
