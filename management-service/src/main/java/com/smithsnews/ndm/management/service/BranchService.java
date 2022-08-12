package com.smithsnews.ndm.management.service;

import org.springframework.data.domain.Page;

import com.smithsnews.ndm.management.model.dto.BranchDto;

public interface BranchService {
	
	BranchDto save(BranchDto branchdto);
	BranchDto update(BranchDto branchdto,long id);
	Page <BranchDto> list (int pageNo);
	
	

}
