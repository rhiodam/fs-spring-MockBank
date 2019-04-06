package com.rhiodamuthie.fsspringmockbank.service;

import com.rhiodamuthie.fsspringmockbank.entity.User;
import com.rhiodamuthie.fsspringmockbank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sickware on 4/5/2019.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public boolean checkUserExists(String username ,String email){
        if (checkUsernameExist(username) || checkEmailExist(email)){
            return true;
        }
        return false;
    }

    public boolean checkEmailExist(String email) {
        if (null != findByEmail(email)){
            return true;
        }
        return false;
    }

    public boolean checkUsernameExist(String username) {
        if (null != findByUsername(username)){
            return true;
        }
        return false;
    }

}
