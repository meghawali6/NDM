package com.smithsnews.ndm.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smithsnews.ndm.management.model.entity.SetupEntity;

@Repository
public interface SetupRepository extends JpaRepository<SetupEntity, Long> {

}
