package tn.firas.springsecurity.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import tn.firas.springsecurity.enums.Role;

public record RegisterRequest(
        @NotNull(message = "firstname must not be null")
        @Pattern(regexp = ".{2,}$",
                message = "name must be more than 2 characters ")
        String firstname,
        @NotNull(message = "lastname must not be null")
        @Pattern(regexp = ".{2,}$",
                message = "name must be more than 2 characters ")
        String lastname,
        @NotNull(message = "email must not be null")
        @Email
        String email,

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
        String password,
        Role role
) {
}
