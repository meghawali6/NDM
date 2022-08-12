package com.smithsnews.ndm.management.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.smithsnews.ndm.management.model.dto.PublicationDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/management/publication")
@Tag(name = "Admin/Management ", description = "Publications API")
public class PublicationsController {

  @Operation(summary = "Create New Publication")
  @PostMapping
  public PublicationDto save(@RequestBody PublicationDto publicationDto) {
    return null;
  }
  
  @Operation(summary = "Update Publication")
  @PutMapping("/{id}")
  public PublicationDto update(@PathVariable Long id,@RequestBody PublicationDto publicationDto) {
    return null;
  }
  
  @Operation(summary = "get Publications List")
  @GetMapping
  public Page<PublicationDto> list(@RequestParam int pageNo) {
    return null;
  }


  


}
