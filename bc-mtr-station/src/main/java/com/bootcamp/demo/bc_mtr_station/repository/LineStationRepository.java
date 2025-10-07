package com.bootcamp.demo.bc_mtr_station.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.demo.bc_mtr_station.entity.LineStationEntity;

@Repository
public interface LineStationRepository
    extends JpaRepository<LineStationEntity, Long> {
  List<LineStationEntity> findByLine_CodeOrderBySeq(String lineCode);

  List<LineStationEntity> findByStationCode(String stationCode);

  Optional<LineStationEntity> findByLine_CodeAndStationCode(String lineCode,
      String stationCode);
}
