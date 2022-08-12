package com.smithsnews.ndm.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smithsnews.ndm.management.model.dto.BranchDto;
import com.smithsnews.ndm.management.service.BranchService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/branch")
@Tag(name = "Admin/Management - Branch", description = "Branch API")
public class BranchController {

	@Autowired
	private BranchService branchservice;
	

    public BranchController(BranchService branchService) {
        this.branchservice = branchService;
   }
	
  @Operation(summary = "Create new Branch")
  @PostMapping
  public BranchDto save(@RequestBody BranchDto branchDto) {
	 return branchservice.save(branchDto);
  }
  
 @Operation(summary = "Update Branch")
  @PutMapping("/{id}")
  public BranchDto update(@PathVariable Long id,@RequestBody BranchDto branchDto) {
	  return branchservice.update(branchDto, id);
  }
  
  @Operation(summary = "get Branches List")
  @GetMapping
  public Page<BranchDto> list(@RequestParam int pageNo) {
    return branchservice.list(pageNo);
  }


  


}
