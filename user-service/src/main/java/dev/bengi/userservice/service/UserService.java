package dev.bengi.userservice.service;

import dev.bengi.userservice.dto.request.RegisterRequest;
import dev.bengi.userservice.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(RegisterRequest registerRequest);

    User getUserByUsername(String username);

    User getUserById(String id);

    User getUserByEmail(String email);
}
