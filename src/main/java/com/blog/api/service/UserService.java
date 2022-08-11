package com.blog.api.service;

import com.blog.api.payloads.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO user);

    UserDTO updateUser(UserDTO user, Integer userId);

    UserDTO getUserById(Integer userId);

    List<UserDTO> getAllUsers();

    void deleteUser(Integer userId);


}
