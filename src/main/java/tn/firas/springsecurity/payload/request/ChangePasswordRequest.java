package tn.firas.springsecurity.payload.request;

public record ChangePasswordRequest(
        String currentPassword,
        String newPassword,
        String confirmationPassword
) { }
