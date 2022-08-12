package com.smithsnews.ndm.management.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.smithsnews.ndm.management.model.dto.WholesalerDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/management/wholesaler")
@Tag(name = "Admin/Management ", description = "Wholesaler API")
public class WholesalerController {

  @Operation(summary = "Create New Wholesaler")
  @PostMapping
  public WholesalerDto save(@RequestBody WholesalerDto wholesalerDto) {
    return null;
  }
  
  @Operation(summary = "Update WholeSaler")
  @PutMapping("/{id}")
  public WholesalerDto update(@PathVariable Long id,@RequestBody WholesalerDto wholesalerDto) {
    return null;
  }
  
  @Operation(summary = "Get WholeSalers List")
  @GetMapping
  public Page<WholesalerDto> list(@PathVariable int pageNo) {
    return null;
  }


  


}
