package dev.bengi.userservice.dto;

import dev.bengi.userservice.enumeration.Role;
import lombok.Data;

@Data
public class AuthUserDTO {
    private String id;
    private String username;
    private String password;
    private Role role;
}