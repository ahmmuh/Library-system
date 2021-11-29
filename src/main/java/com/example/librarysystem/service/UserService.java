package com.example.librarysystem.service;

import com.example.librarysystem.models.User;
import com.example.librarysystem.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getALlUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.getById(id);
    }

    public User addUser(User user){
       return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

   public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
