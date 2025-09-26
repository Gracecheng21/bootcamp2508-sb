package com.bootcamp.demo.demo_database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "users")
@Getter

public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "email")
  private String email;

  @Column(name = "phone")
  private String phone;
  @Column(name = "website")
  private String website;

  @Column(name = "street")
  private String street;
  @Column(name = "suite")
  private String suite;
  @Column(name = "city")
  private String city;
  @Column(name = "zipcode")
  private String zipcode;

  @Column(name = "lat")
  private String lat;
  @Column(name = "lng")
  private String lng;

  @Column(name = "company_name")
  private String company_name;
  @Column(name = "company_catchPhrase")
  private String company_catchPhrase;
  @Column(name = "company_bs")
  private String company_bs;

}
