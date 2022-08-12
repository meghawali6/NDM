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
@Table(name = "setup")
public class SetupEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "wf_tozero")
  private int wfToZero;
  
  @Column(name = "wf_onetoten")
  private int wfOneToTen;
  
  @Column(name = "wf_eleventotwenty")
  private int wfElevenToTwenty;
  
  @Column(name = "wf_twentyonetothirty")
  private int wfTwentyOneToThirty;
  
  @Column(name = "wf_sixtyoneto")
  private int wfSixtyOneTO;
  
  @Column(name = "wf_thirtyonetosixty")
  private int wfThirtyOneToSixty;
  
  @Column(name = "deliverycutoffefficiency")
  private int deliveryCutOffEfficiency;
  
  @Column(name = "maxcapcomp")
  private int maxCapComp;
  
  @Column(name = "earliestsatcapcomp")
  private int earliestSatCapComp;
  
}
