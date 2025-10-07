package com.bootcamp.demo.demo_bc_forum.service;

import java.util.List;
import com.bootcamp.demo.demo_bc_forum.entity.CommentEntity;
import com.bootcamp.demo.demo_bc_forum.model.dto.CommentDTO;
import com.bootcamp.demo.demo_bc_forum.model.dto.PostDTO;
import com.bootcamp.demo.demo_bc_forum.model.dto.UserDTO;

public interface JPHService {
  /**
   * Call external API
   * 
   * @return
   */
  List<UserDTO> getAllUsers();

  List<PostDTO> getAllPosts();

  List<CommentDTO> getAllComments();

  // ! Exercise 3
  // Task 3b - Get Comments By Post Id
  List<CommentEntity> getCommentsByPostId(Long postId);
}
