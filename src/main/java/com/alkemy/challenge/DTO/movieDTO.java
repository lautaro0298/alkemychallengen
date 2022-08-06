/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.DTO;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author lautaro
 */
@Getter
@Setter
public class movieDTO {
    private int id;
    private String title;
    private Date date ;
    private int classification;
    private long weight;
  
    private String image;
}
