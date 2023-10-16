package com.bizcards.backendservice.service;


import com.bizcards.backendservice.dto.CardDto;
import com.bizcards.backendservice.model.AppUser;
import com.bizcards.backendservice.model.BusinessCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;;import java.time.Instant;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class CardService {

    private final UserService userService;

    public AppUser createCard(CardDto cardDto){

        BusinessCard newCard=new BusinessCard();

        newCard.setTitle(cardDto.getTitle());
        newCard.setCompany(cardDto.getCompany());
        newCard.setIndustry(cardDto.getIndustry());
        newCard.setDescription(cardDto.getDescription());
        newCard.setTag(cardDto.getTag());
        newCard.setVisibility(cardDto.getVisibility());
        newCard.setCreationDate(Instant.now().toString());
        newCard.setLastUpdateDate(Instant.now().toString());
        newCard.setUserId(cardDto.getUserId());

        AppUser updatedUser=userService.addCardToUser(newCard);

        return updatedUser;


    }

}
