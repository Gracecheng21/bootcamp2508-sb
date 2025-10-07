package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.dto.FullDataDto;
import com.bootcamp.demo.demo_bc_forum.model.dto.PostDTO;

@Component
public class PostMapper {
  public FullDataDto.PostDto postmap(PostDTO postDTO) {
    return FullDataDto.PostDto.builder() //
      .id(postDTO.getId()) //
      .title(postDTO.getTitle()) //
      .body(postDTO.getBody()) //
      .build();
  }


}
