/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.challenge.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author lautaro
 */
@Data
@Entity
public class characterEntity implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String name;
    private String history;
    @JsonFormat
    private Long weight;
    private String image;
    
     @ManyToMany(mappedBy = "characters")
    private List<movieEntity> movie;
}
