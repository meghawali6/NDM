package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BranchDto implements Serializable {

  private static final long serialVersionUID = 1L;

 private Long id;
  
  private int number;
  
  private String name;
  
  private Long wholesalerId;
  
  private WholesalerDto wholeSaler;
  
  private Long nfrnRegionId;
  
  private Long tvtRegionId;
  
  private String address;
  
  private int numaatsat;
  
  private char active;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date created;
  
  private Date modified;
  
}
