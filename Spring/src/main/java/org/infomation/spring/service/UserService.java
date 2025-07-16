package org.infomation.spring.service;

import org.infomation.spring.dto.request.UserCreationRequest;
import org.infomation.spring.dto.request.UserUpdateRequest;
import org.infomation.spring.dto.response.UserResponse;
import org.infomation.spring.entity.User;
import org.infomation.spring.mapper.UserMappper;
import org.infomation.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMappper userMappper;

    public UserResponse createUser(UserCreationRequest user) {
        if(userRepository.existsByUsername(user.getUsername()))
            throw new RuntimeException("Username already exists");
        User userEntity = userMappper.toUser(user);
        return userMappper.toUserResponse(userRepository.save(userEntity));
    }

    public UserResponse getUser(String id){
        return userMappper.toUserResponse(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found")));
    }

    public UserResponse updateUser(String id, UserUpdateRequest request) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        userMappper.updateUser(user, request);
        return userMappper.toUserResponse(userRepository.save(user));
    }
    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
    public List<UserResponse> getUsers(){
        return userRepository.findAll().stream()
                .map(userMappper::toUserResponse).toList();
    }
}
