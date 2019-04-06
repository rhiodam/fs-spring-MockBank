package com.rhiodamuthie.fsspringmockbank.repository;

import com.rhiodamuthie.fsspringmockbank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sickware on 4/5/2019.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

}
