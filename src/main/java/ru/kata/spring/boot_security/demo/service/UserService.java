package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User updatedUser);

    User getUserById(Integer id);

    void delete(Integer id);

    List<User> getDemandedUsers();

    User findByUsername(String username);

    User setRolesToUser(User user, int[] rolesIdArr);

    void setEncryptedPassword(User user);
}