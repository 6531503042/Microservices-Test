package dev.bengi.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.bengi.userservice.model.UserDetails;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private String id;
    private String username;
    private String email;
    private UserDetails userDetails;
}
