package com.nineleaps.service.impl;

import com.nineleaps.model.User;
import com.nineleaps.repository.UserRepository;
import com.nineleaps.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userrepository;

    public UserServiceImpl(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public User saveuser(User user) {
        return userrepository.save(user);
    }
}
