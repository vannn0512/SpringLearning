package com.chan.service.impl;

import com.chan.dao.ShopDAO;
import com.chan.model.Shop;
import com.chan.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jun.chen on 2018/2/2.
 */

@Service
public class ShopServiceImpl implements IShopService {
  @Autowired
  private ShopDAO shopDAO;

  @Override
  public int addShop(Shop shop) {
    return shopDAO.insertSelective(shop);
  }

  @Override
  public List<Shop> list(Shop shop) {
    return shopDAO.selectByModel(shop);
  }

  @Override
  public Shop getShopById(Integer id) {
    return shopDAO.selectByPrimaryKey(id);
  }

}
