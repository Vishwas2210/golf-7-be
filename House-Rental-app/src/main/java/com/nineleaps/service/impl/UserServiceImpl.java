package com.nineleaps.service.impl;

import com.nineleaps.model.User;
import com.nineleaps.repository.UserRepository;
import com.nineleaps.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
