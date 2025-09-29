package com.bootcamp.demo.demo_weather.service;

import java.util.List;
import com.bootcamp.demo.demo_weather.entity.WeatherForecastEntity;
import com.bootcamp.demo.demo_weather.model.dto.WeatherDTO;

public interface ObservatoryService {
  WeatherDTO getNineDaysWeather();

  List<WeatherForecastEntity> saveForecastWeather(WeatherDTO weatherDTO);
}
