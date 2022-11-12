package com.cognologix.UserMicroservices.service;
import com.cognologix.UserMicroservices.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    List<User> list = List.of(
            new User(1311L, "Durgesh Tiwari", "23525625"),
            new User(1312L, "Ankit Tiwari", "99999"),
            new User(1314L, "Ravi Tiwari", "888")
    );
    @Override
    public User getUserDetails(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}