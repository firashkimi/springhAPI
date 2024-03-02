package tn.firas.springsecurity.payload.request;

import jakarta.validation.constraints.Pattern;

public record ChangePasswordRequest(
        String currentPassword,
        @Pattern(
                regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+*=!-_])(?!.*\\s).{8,16}$",
                message = """
                    password must meet the following conditions:
                    must include at least an upper and lowercase character;
                    must include at least one special character;
                    must not include a white space character;
                    length must be between 8 and 16 characters.
                    """
        )
        String newPassword,
        String confirmationPassword
) { }
