package com.bootcamp.demo.demo_database.mapper;

import com.bootcamp.demo.demo_database.entity.UserEntity;
import com.bootcamp.demo.demo_database.model.User;

public class UserMapper {
  public UserEntity map(User user) {
    return UserEntity.builder() //
      .name(user.getName()) //
      .username(user.getUsername()) //
      .email(user.getEmail()) //
      .phone(user.getPhone()) //
      .website(user.getWebsite()) //
      .street(user.getAddress().getStreet()) //
      .suite(user.getAddress().getSuite()) //
      .city(user.getAddress().getCity()) //
      .zipcode(user.getAddress().getZipcode()) //
      .latitude(user.getAddress().getGeo().getLat()) //
      .longitude(user.getAddress().getGeo().getLng()) //
      .company_name(user.getCompany().getName()) //
      .company_catchPhrase(user.getCompany().getCatchPhrase()) //
      .company_bs(user.getCompany().getBs()) //
      .build();
  }

  public User map(UserEntity user) {
    return null;
  }
}
