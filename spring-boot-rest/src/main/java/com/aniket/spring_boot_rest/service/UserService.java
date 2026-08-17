package com.aniket.spring_boot_rest.service;

import com.aniket.spring_boot_rest.repo.UserRepository;
import com.aniket.spring_boot_rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void debit(Long userId, Double amount) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setBalance(user.getBalance() - amount);
        userRepository.save(user);
    }

    public void credit(Long userId, Double amount) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setBalance(user.getBalance() + amount);
        userRepository.save(user);
    }
}
