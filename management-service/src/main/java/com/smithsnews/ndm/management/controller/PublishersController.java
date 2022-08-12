package com.smithsnews.ndm.management.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smithsnews.ndm.management.model.dto.PublisherDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/management/publishers")
@Tag(name = "Admin/Management ", description = "Publishers API")
public class PublishersController {

  @Operation(summary = "Create New Publisher")
  @PostMapping
  public PublisherDto save(@RequestBody PublisherDto publisherDto) {
    return null;
  }
  
  @Operation(summary = "Update Publisher")
  @PutMapping("/{id}")
  public PublisherDto update(@PathVariable Long id,@RequestBody PublisherDto publisherDto) {
    return null;
  }
  
  @Operation(summary = "Get Publishers List")
  @GetMapping
  public Page<PublisherDto> list(@PathVariable int pageNo) {
    return null;
  }


  


}
