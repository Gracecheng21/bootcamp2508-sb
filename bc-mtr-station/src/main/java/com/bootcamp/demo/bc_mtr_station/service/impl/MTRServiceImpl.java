package com.bootcamp.demo.bc_mtr_station.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.demo.bc_mtr_station.repository.LineRepository;
import com.bootcamp.demo.bc_mtr_station.repository.StationRepository;
import com.bootcamp.demo.bc_mtr_station.service.MTRService;

@Service
public class MTRServiceImpl implements MTRService{
  @Autowired
  private LineRepository lineRepository;
  @Autowired
  private StationRepository stationRepository;

  

}
