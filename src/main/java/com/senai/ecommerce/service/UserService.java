package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.UserDTO;
import com.senai.ecommerce.entities.User;
import com.senai.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO findById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return userToUserDTO(user);
    }

    private UserDTO userToUserDTO(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getPhone(),user.getBirthDate(), user.getRoles());
    }

}
