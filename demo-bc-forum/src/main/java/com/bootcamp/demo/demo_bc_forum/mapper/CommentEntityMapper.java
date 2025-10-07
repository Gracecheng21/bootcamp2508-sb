package com.bootcamp.demo.demo_bc_forum.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_bc_forum.entity.CommentEntity;
import com.bootcamp.demo.demo_bc_forum.model.dto.CommentDTO;

@Component
public class CommentEntityMapper {
  public CommentEntity commentEntityMap(CommentDTO commentDTO) {
    return CommentEntity.builder() //
        // .id(commentDTO.getId()) //
        .name(commentDTO.getName()) //
        .email(commentDTO.getEmail()) //
        .body(commentDTO.getBody()) //
        .build();
  }
}
