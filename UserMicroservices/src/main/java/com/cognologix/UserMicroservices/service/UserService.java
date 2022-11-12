package com.cognologix.UserMicroservices.service;

import com.cognologix.UserMicroservices.model.User;

public interface UserService {
    public User getUserDetails(Long id);
}
