package com.bootcamp.demo.bc_mtr_station.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stations")

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class StationEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Parameter 2 (sta)
  @Column(name = "code", nullable = false)
  private String code; // e.g. "AIR"
  @Column(name = "name", nullable = false)
  private String name; // e.g. "Airport"

  @ManyToOne
  @JoinColumn(name = "line_id")
  private LineEntity lineEntity;


}
