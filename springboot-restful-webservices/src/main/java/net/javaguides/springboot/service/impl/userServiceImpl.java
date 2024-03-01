package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.userRepository;
import net.javaguides.springboot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class userServiceImpl implements userService {

    @Autowired
    private userRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
