package com.bootcamp.demo.bc_mtr_station.controller;

import javax.sound.sampled.Line;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class MTROperation {
  // Part 1 - Prepare the Stations
  @GetMapping(value = "/stations") { //getAllStation (全部站)

  } 


  @GetMapping(value = "stations/{line}") { //getLineByCode (指定線路)

  } 

  // Post a new station by line, previous station, next station
  @PostMapping(value = "/stations") { // createNewStation (新增站)

  }

  // Delete a station by the station code (think of the previous & next station)
  @DeleteMapping(value = "/stations/{code}") // (刪除站)


  // Part 2 - Trains & Station Data
  // Get all stations
  // Return a Map, key=Line & value=List of stations (the data based on your database)

  // Get all stations by line
  // Return List of stations (the data based on your database)

  // Get all the earliest trains by station code.
  // The returned data should be real-time, retrieved from MTR API. The MTR API returns all upcoming trains, but your API just needs to return the earliest coming train for all directions.
  // Validate the station code, based on the data in database.

//   Part 3 - Line Signal
// The MTR API has delay code, refer to the APl spec.
// Green Signal, if there is no station with delay signal.
// Yellow Signal, if there is only 1 station with delay signal.
// Red Signal, if there is more than 1 station with delay signal.
// Get the line signal by line code
// Sample Request: http://localhost:8080/line/signal?line=TKL
// Validate the line code.
// Sample Responses
}