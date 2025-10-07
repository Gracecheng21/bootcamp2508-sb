package com.bootcamp.demo.demo_bc_forum.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo.demo_bc_forum.codelib.GeneralResponse;
import com.bootcamp.demo.demo_bc_forum.codelib.NotFoundException;
import com.bootcamp.demo.demo_bc_forum.codelib.SystemCode;

// 全局攔截
@RestControllerAdvice
public class GlobalExceptionHandler {

  // ! 專業攔截 NumberFormatException
  // @ExceptionHandler(value = NumberFormatException.class)
  // public String handleNumberFormatException(NumberFormatException e) {
  //    return "I got issue, please help. Reason=" + e.getMessage();
  // }

  @ExceptionHandler(value = NumberFormatException.class)
  public GeneralResponse<ErrorMessage> handleNotFoundException(NumberFormatException e) {
    ErrorMessage errorMessage = ErrorMessage.builder() //
      .code(999) //
      .message("I got issue, please help. Reason=" + e.getMessage()) //
      .build();
      return GeneralResponse.<ErrorMessage>builder() //
      // .code(999)
      // .message("System Error.")
      .fail()
      .data(errorMessage)
      .build();
  }

  @ExceptionHandler(value = NotFoundException.class)
  public GeneralResponse<String> handleNotFoundException(NotFoundException e) {
      return GeneralResponse.<String>builder() //
      // .fail() // 99999, "Fail."
      .config(SystemCode.codeOf(e.getCode())) //
      .data(e.getMessage()) //
      .build();
  }

}
