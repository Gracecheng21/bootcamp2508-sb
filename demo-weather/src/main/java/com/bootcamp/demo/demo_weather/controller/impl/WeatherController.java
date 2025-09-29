package com.bootcamp.demo.demo_weather.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_weather.controller.WeatherOperation;
import com.bootcamp.demo.demo_weather.dto.DayForecastDTO;
import com.bootcamp.demo.demo_weather.entity.WeatherForecastEntity;
import com.bootcamp.demo.demo_weather.model.dto.WeatherDTO;
import com.bootcamp.demo.demo_weather.service.ObservatoryService;

@RestController
public class WeatherController implements WeatherOperation {
  @Autowired
  private ObservatoryService observatoryService;
  
  @Override
  public List<DayForecastDTO> getNineDaysWeather() {
    return null;
  }

    @Override
  public List<DayForecastDTO> saveWeatherForecasts() {
    WeatherDTO weatherDTO = this.observatoryService.getNineDaysWeather();
    List<WeatherForecastEntity> weatherForecastEntities =
        this.observatoryService.saveForecastWeather(weatherDTO);
    return weatherForecastEntities.stream() //
      .map(e -> {
        return DayForecastDTO.builder() //
        .date(e.getDate()) //
        .description(e.getDescription()) //
        .week(e.getWeek()) //
        .wind(e.getWind()) //
        .maxTemp(e.getMaxTemp()) //
        .minTemp(e.getMinTemp()) //
        .build();
      }).collect(Collectors.toList());
  }
}
