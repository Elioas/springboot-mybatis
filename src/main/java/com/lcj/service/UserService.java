package com.lcj.service;

import com.lcj.entity.User;

public interface UserService {
    User  getUser(String userId);
    boolean addUser(User user);
}
