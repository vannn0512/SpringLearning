package com.chan.service;

import com.chan.model.Shop;

import java.util.List;

/**
 * Created by jun.chen on 2018/2/2.
 */
public interface IShopService {
  int addShop(Shop shop);

  List<Shop> list(Shop shop);

  Shop getShopById(Integer id);
}
