/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.repositorys;


import com.alkemy.challenge.entity.movieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lautaro
 */
public interface movieRepository extends JpaRepository<movieEntity,Long>{
    
}
