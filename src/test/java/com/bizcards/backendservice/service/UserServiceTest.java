package com.bizcards.backendservice.service;

import com.bizcards.backendservice.dto.UserDto;
import com.bizcards.backendservice.model.AppUser;
import com.bizcards.backendservice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    void demoTest(){
        assertTrue(true);
    }

    @Test
    void testCreateUser(){

        AppUser mockUser=TestUtility.mockAppUser();
        when(userRepository.save(any())).thenReturn(mockUser);

        AppUser createdUser=userService.createUser(TestUtility.getMockUserDto());
        assertEquals("gokulnair",createdUser.getUsername());

    }

}