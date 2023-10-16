package com.bizcards.backendservice.service;

import com.bizcards.backendservice.dto.UserDto;
import com.bizcards.backendservice.model.AppUser;
import com.bizcards.backendservice.model.BusinessCard;

import java.time.Instant;
import java.util.HashSet;

public class TestUtility {

    static BusinessCard createDemoCard(){
        BusinessCard demoCard=new BusinessCard();
        demoCard.setId(1L);
        demoCard.setTitle("CEO card");
        demoCard.setCompany("Nirmala Associates");
        demoCard.setIndustry("Manufacturing");
        demoCard.setDescription("This business card is purely intended for personal use!");
        demoCard.setTag("Business");
        demoCard.setVisibility("public");
        demoCard.setCreationDate(Instant.now().toString());
        demoCard.setLastUpdateDate(Instant.now().toString());
        demoCard.setUserId(1L);

        return demoCard;
    }

    static AppUser mockAppUser(){

        AppUser mockUser=new AppUser();

        mockUser.setId(1L);
        mockUser.setUsername("gokulnair");
        mockUser.setEmail("gokulkbalachandran@gmail.com");
        mockUser.setPassword("Samurai@123");
        mockUser.setProfilePicture("www.demopicture.com");
        mockUser.setDescription("This is a demo description for some unknown User!!");
        mockUser.setCards(new HashSet<>(){{add(createDemoCard());}});

        return mockUser;

    }

    static UserDto getMockUserDto(){
        UserDto mockUserDto=new UserDto();

        mockUserDto.setUsername("gokulnair");
        mockUserDto.setEmail("gokulkbalachandran@gmail.com");
        mockUserDto.setPassword("Samurai@123");
        mockUserDto.setProfilePicture("www.demoprofilepicture.com");
        mockUserDto.setDescription("This is a rabdom demo description");

        return mockUserDto;
    }
}
