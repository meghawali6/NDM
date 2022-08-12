package com.smithsnews.ndm.management.serviceImpl;

//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.smithsnews.ndm.management.model.dto.BranchDto;
import com.smithsnews.ndm.management.model.entity.BranchEntity;
import com.smithsnews.ndm.management.repository.BranchRepository;
import com.smithsnews.ndm.management.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchrepository;

	@Override
	public BranchDto save(BranchDto branchdto) {
		BranchEntity be = this.dtotoentity(branchdto);
		BranchEntity savedbe = this.branchrepository.save(be);
		return this.entitytodto(savedbe);
	}

	
	  @Override 
	  public BranchDto update(BranchDto branchdto, long id) {
	  BranchEntity be = this.branchrepository.findById(id);
	  
	  be.setId(branchdto.getId()); be.setNumber(branchdto.getNumber());
	  be.setWholesalerId(branchdto.getWholesalerId());
	  be.setNfrnRegionId(branchdto.getNfrnRegionId());
	  be.setNfrnRegionId(branchdto.getTvtRegionId());
	  be.setAddress(branchdto.getAddress());
	  be.setNumaatsat(branchdto.getNumaatsat());
	  be.setActive(branchdto.getActive()); be.setCreated(branchdto.getCreated());
	  be.setModified(branchdto.getModified());
	  
	  BranchEntity updatedbe = this.branchrepository.save(be);
	  BranchDto branchdto1 = this.entitytodto(updatedbe);
	  
	  
	  return branchdto1;
	  return null;
	  }
	  
	  
	  
	  @Override
	  public Page<BranchDto> list(int pageNo) {
	  Page<BranchRepository>branches = this.branchrepository.findAll(pageNo); 
	  Page<BranchDto> branchdto = branches.stream().map(branch->this.BranchDto(branch)).collect(Collectors.toList());

		return null; 
		}
	 
	private BranchEntity dtotoentity(BranchDto branchdto) {
		BranchEntity be = new BranchEntity();

		be.setId(branchdto.getId());
		be.setNumber(branchdto.getNumber());
		be.setWholesalerId(branchdto.getWholesalerId());
		be.setNfrnRegionId(branchdto.getNfrnRegionId());
		be.setNfrnRegionId(branchdto.getTvtRegionId());
		be.setAddress(branchdto.getAddress());
		be.setNumaatsat(branchdto.getNumaatsat());
		be.setActive(branchdto.getActive());
		be.setCreated(branchdto.getCreated());
		be.setModified(branchdto.getModified());

		return be;
	}

	private BranchDto entitytodto(BranchEntity branchentity) {
		BranchDto bd = new BranchDto();

		bd.setId(branchentity.getId());
		bd.setNumber(branchentity.getNumber());
		bd.setWholesalerId(branchentity.getWholesalerId());
		bd.setNfrnRegionId(branchentity.getNfrnRegionId());
		bd.setNfrnRegionId(branchentity.getTvtRegionId());
		bd.setAddress(branchentity.getAddress());
		bd.setNumaatsat(branchentity.getNumaatsat());
		bd.setActive(branchentity.getActive());
		bd.setCreated(branchentity.getCreated());
		bd.setModified(branchentity.getModified());

		return bd;
	}

}
