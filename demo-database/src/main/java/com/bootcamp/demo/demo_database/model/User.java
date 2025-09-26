package com.bootcamp.demo.demo_database.model;

import com.bootcamp.demo.demo_database.model.User.Address.Company;
import lombok.Getter;

@Getter
public class User {
  private static Long counter = 0L;

  private Long id;
  private String name;
  private String username;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;

  @Getter
  public static class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @Getter
    public static class Geo {
      private String lat;
      private String lng;
    }

    @Getter 
    public static class Company {
      private String name;
      private String catchPhrase;
      private String bs;
    }

  }


}
