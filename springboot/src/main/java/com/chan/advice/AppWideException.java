package com.chan.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.BindException;

/**
 * Created by jun.chen on 2018/2/5.
 */

@ControllerAdvice
public class AppWideException {

  //@ExceptionHandler()
  public String missParamHandler() {
    return "缺少参数";
  }

  //@ExceptionHandler(IllegalStateException.class)
  public String IllegalStateHandler() {
    return "IllegalState";
  }

//  @ExceptionHandler(BindException.class)
  public Integer BindExceptionHandler() {
    return 233;
  }
}
