package com.intellif.smartcampus.service;

import com.intellif.smartcampus.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
