package com.bootcamp.demo.bc_mtr_station.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "line_stations", uniqueConstraints = {@UniqueConstraint(columnNames = {"line_id", "station_code"})})
// 代表站在某條線的資訊（同一個 station 可能屬於多條 line -> 以此 join 表示）

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class LineStationEntity { 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "line_id")
  private LineEntity LineEntity;

  @ManyToOne(optional = false)
  @JoinColumn(name = "station_id")
  private StationEntity stationEntity;

  @Column(name = "sequence")
  private Integer sequence; // order in the line


  // 用來處理題目要求的「按 previous / next 插入」或刪除時的連結邏輯（字串形式比較簡單，避免 FK 產生循環）。
  @Column(name = "prev_station_code")
  private String prevStationCode; 

  @Column(name = "next_station_code")
  private String nextStationCode;



}
