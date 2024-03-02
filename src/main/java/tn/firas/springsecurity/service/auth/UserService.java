package tn.firas.springsecurity.service.auth;

import tn.firas.springsecurity.payload.request.ChangePasswordRequest;

import java.security.Principal;

public interface UserService {
    void changePassword(ChangePasswordRequest request, Principal connectedUser);
}
