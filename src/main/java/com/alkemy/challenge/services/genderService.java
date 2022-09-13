/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.services;

import com.alkemy.challenge.DTO.genderDTO;
import com.alkemy.challenge.entity.genderEntity;
import com.alkemy.challenge.mappers.genderMapper;
import com.alkemy.challenge.repositorys.genderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lautaro
 */
public class genderService {
       @Autowired
    private  genderMapper gendermapper;
    @Autowired
    private genderRepository genderrepository;
    public List<genderDTO> getAllCharacters(){
        List<genderEntity> lista = genderrepository.findAll();
        List<genderDTO> resultado = gendermapper.genderentitylist2dto(lista);
        return resultado;
    }
    public genderDTO save(genderDTO genderdto){
            genderEntity entity =gendermapper.genderDTO2Entity(genderdto);
            genderEntity entitysave =genderrepository.save(entity);
            genderDTO result = gendermapper.genderEntity2DTO(entitysave);
            return result;
            
    }
    public genderDTO getById(Long id){
     genderEntity entity =genderrepository.getById(id);
            genderDTO result = gendermapper.genderEntity2DTO(entity);
            return result;
    }
    public void delete(Long id){
        genderrepository.deleteById(id);
    }
    public genderDTO update(genderDTO newgender,Long id){
     genderEntity entity= genderrepository.findById(id)
      .map(oldgender -> {
        return genderrepository.save(oldgender);
      })
      .orElseGet(() -> {
        newgender.setId(id);
        genderEntity entitynew =gendermapper.genderDTO2Entity(newgender);
        genderEntity entitysave= genderrepository.save(entitynew);
         
            return entitysave;
      });
     return gendermapper.genderEntity2DTO(entity);
    }
}

