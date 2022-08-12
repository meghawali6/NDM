package com.smithsnews.ndm.management.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private int number;
  
  @Column(name = "username")
  private String userName;
  
  private String password;
  
  private int level;
  
  @Column(name = "parenttype")
  private char parentType;
  
  private Long f_parent;
  
  @Column(name = "firstname")
  private String firstName;
  
  @Column(name = "lastname")
  private String lastName;
  
  private String company;
  
  private String postcode;
  
  private String tel;
  
  private String email;
  
}
