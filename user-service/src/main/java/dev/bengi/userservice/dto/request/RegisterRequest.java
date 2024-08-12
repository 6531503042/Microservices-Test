package dev.bengi.userservice.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message = "Username is required")
    @Size(min =6, message = "Username must be at least 6 characters long")
    private String username;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password must be at least 8 and least one uppercase letter, one lowercase letter, one digit, and one special character")
    @Size(min =6, message = "Password must be at least 6 characters long")
    private String password;

    @Email(message = "Email is not valid")
    private String email;
}
