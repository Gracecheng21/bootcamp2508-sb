package com.bootcamp.demo.demo_bc_forum.codelib;

public class NotFoundException extends BusinessExecption{
  public NotFoundException(SystemCode systemCode) {
    super(systemCode);
  }
}
