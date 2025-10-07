package com.bootcamp.demo.bc_mtr_station.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo.bc_mtr_station.entity.StationEntity;

@Repository
public interface StationRepository extends JpaRepository<StationEntity, Long>{
  Optional<StationEntity>findByCode(String linecode);
  List<StationEntity>findByLine_Code(String code);
}
