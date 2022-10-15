package com.ecommerce.service;

import com.ecommerce.model.User;

import java.util.Optional;

public interface IUserService {
    void saveUser(User user);
    Optional<User> getUserByEmailAndPassword(String email, String password);

}
