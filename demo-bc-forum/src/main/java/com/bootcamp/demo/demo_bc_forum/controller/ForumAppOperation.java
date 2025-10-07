package com.bootcamp.demo.demo_bc_forum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_bc_forum.codelib.GeneralResponse;
import com.bootcamp.demo.demo_bc_forum.dto.FullDataDto;
import com.bootcamp.demo.demo_bc_forum.dto.FullDataDto2;
import com.bootcamp.demo.demo_bc_forum.entity.CommentEntity;
import com.bootcamp.demo.demo_bc_forum.entity.UserEntity;

public interface ForumAppOperation {

  /**
   * 
   * @return
   */
  // ! Exercise 2: Task 3a
  @GetMapping(value = "/fulldata")
  List<FullDataDto> getFullData();

  // ! Exercise 2: Task 3b
  @GetMapping(value = "/fulldata2")
  GeneralResponse<FullDataDto2> getFullData2(
      @RequestParam(value = "userid") String uid);

  // ! Exercise 3
  // Revise APIs for User
  // a. GET all users
  @GetMapping(value = "/users")
  List<UserEntity> getAllUser();

  // b. GET user by id (Use RequestParam)
  @GetMapping(value = "/user")
  UserEntity getById(@RequestParam Long id);

  // Task 3c - Get Comments By Post Id
  @GetMapping(value = "/comments")
  GeneralResponse<List<CommentEntity>> getCommentsByPostId(
      @RequestParam(value = "postid") Long id);

}
