/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.controllers;

import com.alkemy.challenge.DTO.movieDTO;
import com.alkemy.challenge.services.movieService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lautaro
 */
public class movieController {
      @Autowired
private movieService movieservice;
@GetMapping("/movie/{id}")
public ResponseEntity<movieDTO> getById(@RequestParam Long id){
    movieDTO movie = movieservice.getById(id);
    return ResponseEntity.status(HttpStatus.FOUND).body(movie);
}
@GetMapping("/getAll")
public ResponseEntity<List<movieDTO>> getAll(){
        List<movieDTO> movie=this.movieservice.getAllCharacters();
         return ResponseEntity.ok().body(movie);
                
}
@PostMapping("/save")
public ResponseEntity<movieDTO> save (@RequestBody movieDTO movie){
    movieDTO movieGuardado = movieservice.save(movie);
    return ResponseEntity.status(HttpStatus.CREATED).body(movieGuardado);
}
 @DeleteMapping("/movie/{id}")
 public ResponseEntity<movieDTO> delete (@RequestParam Long id){
    movieservice.delete(id);
    return ResponseEntity.status(HttpStatus.OK).build();
}
  @PutMapping("/movie/{id}")
 public ResponseEntity<movieDTO> update(@Valid @RequestBody movieDTO movieDto, @PathVariable Long id) {
        movieDTO update = movieservice.update(movieDto, id);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }
}
