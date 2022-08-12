package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PublisherDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  
  private String name;
  
  private char active;

  private Date created;
  
  private Date modified;
  
}
