package dev.bengi.userservice.model;

import dev.bengi.userservice.enumeration.Role;
import lombok.*;

import javax.persistence.*;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User  extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false, updatable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Embedded
    private UserDetails userDetails;
}
