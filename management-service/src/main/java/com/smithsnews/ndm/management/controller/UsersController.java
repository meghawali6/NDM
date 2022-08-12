package com.smithsnews.ndm.management.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smithsnews.ndm.management.model.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/management/user")
@Tag(name = "Admin/Management ", description = "User API")
public class UsersController {

  @Operation(summary = "Create New User")
  @PostMapping
  public UserDto save(@RequestBody UserDto userDto) {
    return null;
  }
  
  @Operation(summary = "Update User")
  @PutMapping("/{id}")
  public UserDto update(@PathVariable Long id,@RequestBody UserDto userDto) {
    return null;
  }
  
  @Operation(summary = "Get Users List")
  @GetMapping
  public Page<UserDto> list(@PathVariable int pageNo) {
    return null;
  }


  


}
