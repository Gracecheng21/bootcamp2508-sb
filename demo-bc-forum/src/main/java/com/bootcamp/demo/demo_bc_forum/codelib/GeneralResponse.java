package com.bootcamp.demo.demo_bc_forum.codelib;

import com.bootcamp.demo.demo_bc_forum.exception.ErrorMessage;

// ! API Response (base on Java 5)
public class GeneralResponse<T> {
  private Integer code;
  private String message;
  private T data;

  // Construtor, Builder

  public Integer getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

  public T getData() {
    return this.data;
  }

  public static <T> Builder<T> builder() {
    return new Builder<>();
  }

  public GeneralResponse(Builder<T> builder) {
    this.code = builder.code;
    this.message = builder.message;
    this.data = builder.data;
  }

  public static class Builder<T> {
    private Integer code;
    private String message;
    private T data;

    public Builder() {
      this.code = 0;
      this.message = "OK.";
    }

    public Builder<T> ok() {
      this.code = SystemCode.FAIL.getCode();
      this.message = SystemCode.FAIL.getMessage();
      return this;
    }

    public Builder<T> fail() {
      this.code = SystemCode.FAIL.getCode();
      this.message = SystemCode.FAIL.getMessage();
      return this;
    }

    public Builder<T> config(SystemCode systemCode) {
      this.code = systemCode.getCode();
      this.message = systemCode.getMessage();
      return this;
    }

  // ! Setter
  // public Builder<T> code(Integer code) {
  // this.code = code;
  // return this;
  // }

  // ! Setter
  // public Builder<T> message(String message) {
  // this.message = message;
  // return this;
  // }

  public Builder<T> data(T data) {
    this.data = data;
    return this;
  }

  public GeneralResponse<T> build() {
    return new GeneralResponse<>(this);
  }

}

  public static void main(String[] args) {
    GeneralResponse<ErrorMessage> response =
        GeneralResponse.<ErrorMessage>builder() //
            // .code(999) //
            .fail() //
            .data(new ErrorMessage(999, "ABCDE")).build();

    System.out.println(response.getCode());
    System.out.println(response.getMessage());
    System.out.println(response.getData());
  }


}
