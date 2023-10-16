package com.bizcards.backendservice.service;


import com.bizcards.backendservice.dto.UserDto;
import com.bizcards.backendservice.model.AppUser;
import com.bizcards.backendservice.model.BusinessCard;
import com.bizcards.backendservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public AppUser createUser(UserDto userDto) {

        AppUser appUser=new AppUser();

        appUser.setUsername(userDto.getUsername());

        appUser.setEmail(userDto.getEmail());

        appUser.setPassword(userDto.getPassword());

        appUser.setProfilePicture(userDto.getProfilePicture());

        appUser.setDescription(userDto.getDescription());

        userRepository.save(appUser);

        return appUser;



    }

    public AppUser addCardToUser(BusinessCard newCard) {

        Optional<AppUser> user=userRepository.findById(newCard.getUserId());
        AppUser updatedUser;

        if(user.isPresent()){
            Set<BusinessCard>currentCardSet=user.get().getCards();
            currentCardSet.add(newCard);
            user.get().setCards(currentCardSet);
            updatedUser=userRepository.save(user.get());

        }else {
            throw new RuntimeException("user does not exists!!");
        }

        return updatedUser;

    }
}
