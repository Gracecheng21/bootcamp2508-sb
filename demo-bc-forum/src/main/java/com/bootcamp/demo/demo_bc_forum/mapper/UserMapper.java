package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.dto.FullDataDto;
import com.bootcamp.demo.demo_bc_forum.model.dto.UserDTO;

// ! same as Bean
// ! non-controller, non-service, non-repository
@Component // inner class can autowired by other class
public class UserMapper {
// Entity → API DTO
    public FullDataDto userMap(UserDTO dto) {

        FullDataDto.AddressDto.GeoDto geoDto =
                FullDataDto.AddressDto.GeoDto.builder() //
                        .lat(dto.getAddress().getGeo().getLat()) //
                        .lng(dto.getAddress().getGeo().getLng()) //
                        .build();

        FullDataDto.AddressDto addressDto = FullDataDto.AddressDto.builder() //
                .street(dto.getAddress().getStreet()) //
                .suite(dto.getAddress().getSuite()) //
                .city(dto.getAddress().getCity()) //
                .zipcode(dto.getAddress().getZipcode()) //
                .geo(geoDto) //
                .build();

        FullDataDto.CompanyDto companyDto = FullDataDto.CompanyDto.builder() //
                .name(dto.getCompany().getName()) //
                .catchPhrase(dto.getCompany().getCatchPhrase()) //
                .bs(dto.getCompany().getBs()) //
                .build();

        return FullDataDto.builder() //
                .id(dto.getId()) //
                .name(dto.getName()) //
                .username(dto.getUsername()) //
                .email(dto.getEmail()) //
                .address(addressDto) //
                .phone(dto.getPhone()) //
                .website(dto.getWebsite()) //
                .company(companyDto) //
                .build();
    }


}
