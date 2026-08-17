package com.aniket.spring_boot_rest.service;

import com.aniket.spring_boot_rest.repo.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private UserService userService;

    @Transactional
    public void transfer(Long senderId, Long receiverId, Double amount) {
        userService.debit(senderId,amount);
        userService.credit(receiverId,amount);
    }
}
