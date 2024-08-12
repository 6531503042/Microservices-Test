package dev.bengi.userservice.service.impl;

import dev.bengi.userservice.dto.request.RegisterRequest;
import dev.bengi.userservice.enumeration.Role;
import dev.bengi.userservice.model.User;
import dev.bengi.userservice.repository.UserRepository;
import dev.bengi.userservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    //Injection with constructor
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(RegisterRequest registerRequest) {
       User toCreate = User.builder()
               .username(registerRequest.getUsername())
               .password(registerRequest.getPassword())
               .email(registerRequest.getEmail())
               .role(Role.USER)
               .build();
       return userRepository.save(toCreate);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
