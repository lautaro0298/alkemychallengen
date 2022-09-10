/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.mappers;
import com.alkemy.challenge.entity.genderEntity;
import  com.alkemy.challenge.DTO.genderDTO;

import java.util.ArrayList;
import java.util.List;
public class genderMapper {
      public genderEntity genderDTO2Entity(genderDTO genderdto){
        genderEntity genderentity = new genderEntity();
        genderentity.setName(genderdto.getName());
        
       
        genderentity.setImage(genderdto.getImage());
        return genderentity;
    }
    public genderDTO genderEntity2DTO (genderEntity entity){
     genderDTO dto = new genderDTO();
     dto.setId(entity.getId());
     dto.setName(entity.getName());
     dto.setImage(entity.getImage());
     
     return dto;
    }
    public List<genderDTO> genderentitylist2dto (List<genderEntity> lista){
       List<genderDTO> resultado = new ArrayList<genderDTO>();
        for (genderEntity elemento:lista) {
            resultado.add(this.genderEntity2DTO(elemento));
        }
        return resultado;
    }
}
