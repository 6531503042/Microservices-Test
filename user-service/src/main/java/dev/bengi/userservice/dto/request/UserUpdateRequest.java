package dev.bengi.userservice.dto.request;

import dev.bengi.userservice.model.UserDetails;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserUpdateRequest {

    @NotBlank(message = "Username is required")
    private String id;

    private String username;

    private String password;

    private UserDetails userDetails;
}
