/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author lautaro
 */
@Data
@Entity
public class genderEntity implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;

    private String image;
      @OneToOne
     private movieEntity movie;
   
}
