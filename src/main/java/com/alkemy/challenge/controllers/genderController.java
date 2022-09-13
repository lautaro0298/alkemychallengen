/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.controllers;

import com.alkemy.challenge.DTO.genderDTO;
import com.alkemy.challenge.services.genderService;
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
public class genderController {
      @Autowired
private genderService genderservice;
@GetMapping("/gender/{id}")
public ResponseEntity<genderDTO> getById(@RequestParam Long id){
    genderDTO gender = genderservice.getById(id);
    return ResponseEntity.status(HttpStatus.FOUND).body(gender);
}
@GetMapping("/getAll")
public ResponseEntity<List<genderDTO>> getAll(){
        List<genderDTO> gender=this.genderservice.getAllCharacters();
         return ResponseEntity.ok().body(gender);
                
}
@PostMapping("/save")
public ResponseEntity<genderDTO> save (@RequestBody genderDTO gender){
    genderDTO genderGuardado = genderservice.save(gender);
    return ResponseEntity.status(HttpStatus.CREATED).body(genderGuardado);
}
 @DeleteMapping("/gender/{id}")
 public ResponseEntity<genderDTO> delete (@RequestParam Long id){
    genderservice.delete(id);
    return ResponseEntity.status(HttpStatus.OK).build();
}
  @PutMapping("/gender/{id}")
 public ResponseEntity<genderDTO> update(@Valid @RequestBody genderDTO genderDto, @PathVariable Long id) {
        genderDTO update = genderservice.update(genderDto, id);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }
}
