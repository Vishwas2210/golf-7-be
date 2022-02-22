package com.nineleaps.service.impl;

import com.nineleaps.model.Provider;
import com.nineleaps.model.User;
import com.nineleaps.repository.UserRepository;
import com.nineleaps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) throws Exception {
        User local = userRepository.findByEmail(user.getEmail());
        if (local != null){
            System.out.println("User Already Exist.");
            throw new Exception("User Already Exist.");
        }
        else
            local = userRepository.save(user);
        return local;
    }

    public void processOAuthPostLogin(String username) {
        User existUser = userRepository.getUserByUsername(username);

        if (existUser == null) {
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setProvider(Provider.GOOGLE);

            userRepository.save(newUser);
        }
    }
}
