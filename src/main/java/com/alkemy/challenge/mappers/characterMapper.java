/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.mappers;

import com.alkemy.challenge.DTO.characterDTO;
import com.alkemy.challenge.entity.characterEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author lautaro
 */
@Component
public class characterMapper {
    public characterEntity characterDTO2Entity(characterDTO characterdto){
        characterEntity characterentity = new characterEntity();
        characterentity.setName(characterdto.getName());
        characterentity.setHistory(characterdto.getHistory());
        characterentity.setWeight(characterdto.getWeight());
        characterentity.setImage(characterdto.getImage());
        return characterentity;
    }
    public characterDTO characterEntity2DTO (characterEntity entity){
     characterDTO dto = new characterDTO();
     dto.setId(entity.getId());
     dto.setName(entity.getName());
     dto.setImage(entity.getImage());
     dto.setHistory(entity.getHistory());
     dto.setWeight(entity.getWeight());
     return dto;
    }
}