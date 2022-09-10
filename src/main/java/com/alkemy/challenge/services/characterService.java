/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.services;

import com.alkemy.challenge.DTO.characterDTO;
import com.alkemy.challenge.entity.characterEntity;
import com.alkemy.challenge.mappers.characterMapper;
import com.alkemy.challenge.repositorys.characterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author lautaro
 */
@Service
public class characterService {
    @Autowired
    private  characterMapper charactermapper;
    @Autowired
    private characterRepository characterrepository;
    public List<characterDTO> getAllCharacters(){
        List<characterEntity> lista = characterrepository.findAll();
        List<characterDTO> resultado = charactermapper.characterentitylist2dto(lista);
        return resultado;
    }
    public characterDTO save(characterDTO characterdto){
            characterEntity entity =charactermapper.characterDTO2Entity(characterdto);
            characterEntity entitysave =characterrepository.save(entity);
            characterDTO result = charactermapper.characterEntity2DTO(entitysave);
            return result;
            
    }
    public characterDTO getById(Long id){
     characterEntity entity =characterrepository.getById(id);
            characterDTO result = charactermapper.characterEntity2DTO(entity);
            return result;
    }
}
