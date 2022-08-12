package com.smithsnews.ndm.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smithsnews.ndm.management.model.entity.WholesalerEntity;

@Repository
public interface WholesalerRepository extends JpaRepository<WholesalerEntity, Long> {

}
