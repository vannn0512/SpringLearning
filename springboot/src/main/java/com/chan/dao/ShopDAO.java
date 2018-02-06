package com.chan.dao;

import com.chan.model.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper()
public interface ShopDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    List<Shop> selectByModelLike(Shop record);

    List<Shop> selectByModel(Shop record);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}
