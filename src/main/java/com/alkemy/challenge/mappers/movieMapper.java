/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.mappers;
import com.alkemy.challenge.entity.movieEntity;
import com.alkemy.challenge.DTO.movieDTO;

import java.util.ArrayList;
import java.util.List;
public class movieMapper {
        public movieEntity movieDTO2Entity(movieDTO moviedto){
        movieEntity movieentity = new movieEntity();
         movieentity.setId(moviedto.getId());
        movieentity.setTitle(moviedto.getTitle());
        movieentity.setClassification(moviedto.getClassification());
        movieentity.setWeight(moviedto.getWeight());
        movieentity.setImage(moviedto.getImage());
         movieentity.setDate(moviedto.getDate());
        return movieentity;
    }
    public movieDTO movieEntity2DTO (movieEntity entity){
     movieDTO dto = new movieDTO();
     dto.setId(entity.getId());
     dto.setTitle(entity.getTitle());
     dto.setImage(entity.getImage());
     dto.setClassification(entity.getClassification());
     dto.setWeight(entity.getWeight());
     dto.setDate(entity.getDate());
     
     return dto;
    }
    public List<movieDTO> movieentitylist2dto (List<movieEntity> lista){
       List<movieDTO> resultado = new ArrayList<movieDTO>();
        for (movieEntity elemento:lista) {
            resultado.add(this.movieEntity2DTO(elemento));
        }
        return resultado;
    }
}
