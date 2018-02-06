package com.chan.controller;

import com.chan.model.Advertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun.chen on 2018/2/3.
 */

@RestController
@RequestMapping("/advertise")
public class AdvertiseController {

  @Autowired
  private Advertise advertise;


  @RequestMapping("/get")
  @ResponseBody
  public Advertise getAdvertise() {
    return advertise;
  }
}
