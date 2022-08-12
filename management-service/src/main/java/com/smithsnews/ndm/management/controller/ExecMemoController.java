package com.smithsnews.ndm.management.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.smithsnews.ndm.management.model.dto.ExecMemoDto;
import com.smithsnews.ndm.management.model.dto.WholesalerDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/management/execmemo")
@Tag(name = "Admin/Management ", description = "Executive Memo API")
public class ExecMemoController {

  @Operation(summary = "Create New Executive Memo")
  @PostMapping
  public ExecMemoDto save(@RequestBody ExecMemoDto execMemoDto) {
    return null;
  }
  
  @Operation(summary = "Update Executive Memo")
  @PutMapping("/{id}")
  public ExecMemoDto update(@PathVariable Long id,@RequestBody ExecMemoDto execMemoDto) {
    return null;
  }
  
  @Operation(summary = "Get Executive Memos List")
  @GetMapping
  public Page<WholesalerDto> list(@RequestParam int pageNo) {
    return null;
  }
  
  @Operation(summary = "Delete Executive Memo")
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
  }


  


}
