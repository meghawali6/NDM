package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExecMemoDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  
  private String memo;
  
  private String contactName;
  
  private int dow;
  
  private Date created;
  
  private Date modified;
  
}
