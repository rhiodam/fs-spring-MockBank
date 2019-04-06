package com.rhiodamuthie.fsspringmockbank.service;

import com.rhiodamuthie.fsspringmockbank.entity.User;

/**
 * Created by Sickware on 4/5/2019.
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username ,String email);

    boolean checkEmailExist(String email);

    boolean checkUsernameExist(String username);

}
