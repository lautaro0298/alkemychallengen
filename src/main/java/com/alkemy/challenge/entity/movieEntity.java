package com.alkemy.challenge.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
@Data
@Entity
public class movieEntity implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id ;
    private String title;
    private Date date ;
    private int classification;
    private long weight;
  
    private String image;
     @OneToOne
    private genderEntity Gender;
    @JoinTable(
        name = "filmCaracters",
        joinColumns = @JoinColumn(name = "FK_film", nullable = false),
        inverseJoinColumns = @JoinColumn(name="FK_character", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<characterEntity> characters;
}
