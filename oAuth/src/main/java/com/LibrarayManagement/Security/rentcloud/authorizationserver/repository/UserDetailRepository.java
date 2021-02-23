package com.LibrarayManagement.Security.rentcloud.authorizationserver.repository;


import com.LibrarayManagement.Security.rentcloud.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}