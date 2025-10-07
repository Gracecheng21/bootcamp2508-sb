package com.bootcamp.demo.demo_bc_forum.codelib;

public class BusinessExecption extends RuntimeException{
  private Integer code;

  public BusinessExecption(SystemCode systemCode) {
    super(systemCode.getMessage());
    this.code = systemCode.getCode();
  }

  public Integer getCode() {
    return this.code;
  }
}
