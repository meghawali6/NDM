package com.smithsnews.ndm.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smithsnews.ndm.management.model.dto.BranchDto;
import com.smithsnews.ndm.management.model.entity.BranchEntity;

@Repository
public interface BranchRepository extends JpaRepository<BranchEntity, Long> {


}
