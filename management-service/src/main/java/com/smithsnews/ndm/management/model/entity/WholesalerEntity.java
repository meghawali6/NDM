package com.smithsnews.ndm.management.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "wholesaler")
public class WholesalerEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private int number;
  
  private String name;
  
  @Column(name = "contactname")
  private String contactName;
  
  private String email;
  
  private char active;
  
  private char type;
  
  @Temporal(TemporalType.DATE)
  private Date created;
  
  @Temporal(TemporalType.TIMESTAMP)
  private Date modified;
  
}
