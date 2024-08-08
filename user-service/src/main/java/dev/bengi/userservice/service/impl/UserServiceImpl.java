package dev.bengi.userservice.service.impl;

import dev.bengi.userservice.repository.UserRepository;
import dev.bengi.userservice.service.UserService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

}
