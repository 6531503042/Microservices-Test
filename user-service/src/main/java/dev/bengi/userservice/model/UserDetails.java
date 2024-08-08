package dev.bengi.userservice.model;

import javax.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String student_id;

}
