package com.chan.dao;

import com.chan.model.Advertise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdvertiseDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertise record);

    int insertSelective(Advertise record);

    Advertise selectByPrimaryKey(Integer id);

    List<Advertise> selectByModelLike(Advertise record);

    List<Advertise> selectByModel(Advertise record);

    int updateByPrimaryKeySelective(Advertise record);

    int updateByPrimaryKey(Advertise record);
}
