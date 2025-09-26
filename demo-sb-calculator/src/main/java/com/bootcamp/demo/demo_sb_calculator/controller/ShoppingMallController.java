package com.bootcamp.demo.demo_sb_calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_calculator.model.ShoppingMall;
import com.bootcamp.demo.demo_sb_calculator.model.ShoppingMall.Cinema;
import com.bootcamp.demo.demo_sb_calculator.model.ShoppingMall.Cinema.Film;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ShoppingMallController {
  @GetMapping("/shoppingmall")
  public ShoppingMall getShoppingMall() {
    Film film1 = Film.builder() //
      .name("film A") //
      .releaseDate(LocalDate.of(2022, 01, 01)) //
      .build();

    Film film2 = Film.builder() //
      .name("film B") //
      .releaseDate(LocalDate.of(2022, 01, 02)) //
      .build();

    Cinema c1 = Cinema.builder() //
      .name("Cinema A") //
      .openedDate(LocalDate.of(2022, 01, 01)) //
      .releasedFilms(List.of(film1,film2))
      .build();

      return ShoppingMall.builder() //
      .name("K11") //
      .area(19000) //
      .cinema(c1) //
      .shopCategories(List.of("Sport", "Food", "Clothing"))
      .build();
      
  }

}
