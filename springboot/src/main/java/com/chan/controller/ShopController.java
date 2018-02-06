package com.chan.controller;

import com.chan.model.Shop;
import com.chan.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jun.chen on 2018/2/2.
 */

@RestController
@RequestMapping("/shop")
public class ShopController {

  @Autowired
  private IShopService shopService;


  @RequestMapping("/list")
  @ResponseBody
  public List<Shop> getShopByModel(Shop shop) {
    return shopService.list(shop);
  }

  @RequestMapping("/{id}")
  @ResponseBody
  public Shop getShopById(@PathVariable Integer id) {
    return shopService.getShopById(id);
  }

}
