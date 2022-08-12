package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WholesalerDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  
  private int number;
  
  private String name;
  
  private String contactName;
  
  private String email;
  
  private char active;
  
  private char type;
  
  private Date created;
  
  private Date modified;
  
}
