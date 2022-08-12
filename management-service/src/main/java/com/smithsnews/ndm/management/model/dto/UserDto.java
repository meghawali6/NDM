package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  
  private int number;
  
  private String userName;
  
  private String password;
  
  private int level;
  
  private char parentType;
  
  private Long f_parent;
  
  private String firstName;
  
  private String lastName;
  
  private String company;
  
  private String postcode;
  
  private String tel;
  
  private String email;
  
}
