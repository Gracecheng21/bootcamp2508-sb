package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.entity.UserEntity;
import com.bootcamp.demo.demo_bc_forum.model.dto.UserDTO;

@Component
public class UserEntityMapper {
  public UserEntity userEntityMap(UserDTO userDTO) {
    return UserEntity.builder() //
      .origUserId(userDTO.getId()) //
      .name(userDTO.getName()) //
      .username(userDTO.getUsername()) //
      .email(userDTO.getEmail()) //
      .street(userDTO.getAddress().getStreet()) //
      .city(userDTO.getAddress().getCity()) //
      .zipcode(userDTO.getAddress().getZipcode()) //
      .suite(userDTO.getAddress().getSuite()) //
      .website(userDTO.getWebsite()) //
      .phone(userDTO.getPhone()) //
      .latitude(userDTO.getAddress().getGeo().getLat()) //
      .longitude(userDTO.getAddress().getGeo().getLng()) //
      .companyBs(userDTO.getCompany().getBs()) //
      .companyName(userDTO.getCompany().getName()) //
      .companyCatchPhrase(userDTO.getCompany().getCatchPhrase()) //
      .build();
  }


}
