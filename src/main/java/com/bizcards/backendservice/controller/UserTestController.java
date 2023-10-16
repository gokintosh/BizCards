package com.bizcards.backendservice.controller;

import com.bizcards.backendservice.dto.CardDto;
import com.bizcards.backendservice.dto.UserDto;
import com.bizcards.backendservice.model.AppUser;
import com.bizcards.backendservice.model.BusinessCard;
import com.bizcards.backendservice.service.CardService;
import com.bizcards.backendservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class UserTestController {

    private final UserService userService;

    private final CardService cardService;

    @PostMapping("/createuser")
    public ResponseEntity<AppUser>createUser(@Valid @RequestBody UserDto userDto){

        AppUser user= userService.createUser(userDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);

    }

    @PostMapping("/createcard")
    public ResponseEntity<AppUser>createCard(@RequestBody CardDto cardDto){

        AppUser updatedUser=cardService.createCard(cardDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(updatedUser);

    }


}
