package com.bootcamp.demo.demo_database.entity;

import com.bootcamp.demo.demo_database.model.User.Address.Company;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "users")
@Getter
@Builder
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  // No @Column means default table name
  private String name;
  private String username;
  private String email;
  private String phone;
  private String website;

  private String street;
  private String suite;
  private String city;
  private String zipcode;

  private String latitude;
  private String longitude;

  @Column(name = "company_name")
  private String company_name;
  @Column(name = "company_catchPhrase")
  private String company_catchPhrase;
  @Column(name = "company_bs")
  private String company_bs;


}
