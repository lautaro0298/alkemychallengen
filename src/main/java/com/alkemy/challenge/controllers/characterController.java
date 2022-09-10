/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.controllers;

import com.alkemy.challenge.DTO.characterDTO;
import com.alkemy.challenge.services.characterService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lautaro
 */
@RestController
@RequestMapping("/character")
public class characterController {
  @Autowired
private characterService characterservice;
@GetMapping("/{id}")
public ResponseEntity<characterDTO> getById(Long id){
    characterDTO character = characterservice.getById(id);
    return ResponseEntity.status(HttpStatus.FOUND).body(character);
}
@GetMapping
public ResponseEntity<List<characterDTO>> getAll(){
        List<characterDTO> character=this.characterservice.getAllCharacters();
         return ResponseEntity.ok().body(character);
                
}
@PostMapping
public ResponseEntity<characterDTO> save (@RequestBody characterDTO character){
    characterDTO characterGuardado = characterservice.save(character);
    return ResponseEntity.status(HttpStatus.CREATED).body(characterGuardado);
}

}
