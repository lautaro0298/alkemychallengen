/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.services;

import com.alkemy.challenge.DTO.movieDTO;
import com.alkemy.challenge.entity.movieEntity;
import com.alkemy.challenge.mappers.movieMapper;
import com.alkemy.challenge.repositorys.movieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lautaro
 */
public class movieService {
         @Autowired
    private  movieMapper moviemapper;
    @Autowired
    private movieRepository movierepository;
    public List<movieDTO> getAllCharacters(){
        List<movieEntity> lista = movierepository.findAll();
        List<movieDTO> resultado = moviemapper.movieentitylist2dto(lista);
        return resultado;
    }
    public movieDTO save(movieDTO moviedto){
            movieEntity entity =moviemapper.movieDTO2Entity(moviedto);
            movieEntity entitysave =movierepository.save(entity);
            movieDTO result = moviemapper.movieEntity2DTO(entitysave);
            return result;
            
    }
    public movieDTO getById(Long id){
     movieEntity entity =movierepository.getById(id);
            movieDTO result = moviemapper.movieEntity2DTO(entity);
            return result;
    }
    public void delete(Long id){
        movierepository.deleteById(id);
    }
    public movieDTO update(movieDTO newmovie,Long id){
     movieEntity entity= movierepository.findById(id)
      .map(oldmovie -> {
        return movierepository.save(oldmovie);
      })
      .orElseGet(() -> {
        newmovie.setId(id);
        movieEntity entitynew =moviemapper.movieDTO2Entity(newmovie);
        movieEntity entitysave= movierepository.save(entitynew);
         
            return entitysave;
      });
     return moviemapper.movieEntity2DTO(entity);
    }
}
