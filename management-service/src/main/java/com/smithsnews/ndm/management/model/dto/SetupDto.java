package com.smithsnews.ndm.management.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SetupDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  
  private int wfToZero;
  
  private int wfOneToTen;
  
  private int wfElevenToTwenty;
  
  private int wfTwentyOneToThirty;
  
  private int wfSixtyOneTO;
  
  private int wfThirtyOneToSixty;
  
  private int deliveryCutOffEfficiency;
  
  private int maxCapComp;
  
  private int earliestSatCapComp;
  
}
