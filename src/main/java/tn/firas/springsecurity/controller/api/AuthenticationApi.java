package tn.firas.springsecurity.controller.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.firas.springsecurity.payload.request.AuthenticationRequest;
import tn.firas.springsecurity.payload.request.RegisterRequest;
import tn.firas.springsecurity.payload.response.AuthenticationResponse;

import java.io.IOException;

import static tn.firas.springsecurity.utils.Constants.AUTHENTICATION_ENDPOINT;


@Tag(name = "authentication")
public interface AuthenticationApi {

    @PostMapping(AUTHENTICATION_ENDPOINT + "/register")
     ResponseEntity<AuthenticationResponse> register( @RequestBody @Valid RegisterRequest request );

    @PostMapping(AUTHENTICATION_ENDPOINT + "/authenticate")
     ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);
    @PostMapping("/refresh-token")
     void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;


}