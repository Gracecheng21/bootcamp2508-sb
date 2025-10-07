package com.bootcamp.demo.bc_mtr_station.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lines")

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class LineEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Parameter 1 (line)
  @Column(name = "code", unique = true, nullable = false)
  private String code; // e.g. "AEL"
  @Column(name = "name", nullable = false)
  private String name; // e.g. "Airport Express "


}
