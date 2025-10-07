package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.dto.FullDataDto;
import com.bootcamp.demo.demo_bc_forum.model.dto.CommentDTO;

@Component
public class CommentMapper {
    public FullDataDto.PostDto.CommentDto commentMap(CommentDTO commentDTO) {
    return FullDataDto.PostDto.CommentDto.builder() //
      .id(commentDTO.getId()) //
      .name(commentDTO.getName()) //
      .email(commentDTO.getEmail()) //
      .body(commentDTO.getBody()) //
      .build();
  }


}
