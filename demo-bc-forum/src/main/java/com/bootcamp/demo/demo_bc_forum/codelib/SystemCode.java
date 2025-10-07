package com.bootcamp.demo.demo_bc_forum.codelib;

public enum SystemCode {
  OK(0, "OK."),
  FAIL(99999, "Fail."),
  ID_NOT_FOUND(99998, "ID Not Found."),
  ENUM_NOT_FOUND(99997, "enum not fouud by code."),;

  private Integer code;
  private String message;

  private SystemCode(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public Integer getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

  // find enum by code
  public static SystemCode codeOf(Integer code) {
    if (code == null)
    throw new NotFoundException(SystemCode.ENUM_NOT_FOUND);
    for (SystemCode s : values()) {
      if (s.getCode().equals(code))
        return s;
    }
    throw new NotFoundException(SystemCode.ENUM_NOT_FOUND);
  }
}
