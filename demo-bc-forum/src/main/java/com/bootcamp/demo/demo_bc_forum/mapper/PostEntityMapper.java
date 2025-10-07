package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.entity.PostEntity;
import com.bootcamp.demo.demo_bc_forum.model.dto.PostDTO;

@Component
public class PostEntityMapper {
  public PostEntity postEntityMap(PostDTO postDTO) {
    return PostEntity.builder() //
      .origPostId(postDTO.getId()) //
      .title(postDTO.getTitle()) //
      .body(postDTO.getBody()) //
      .build();
  }


}
