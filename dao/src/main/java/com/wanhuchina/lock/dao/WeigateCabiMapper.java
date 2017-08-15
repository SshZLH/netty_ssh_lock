package com.wanhuchina.lock.dao;

import com.wanhuchina.lock.model.cabinet.WeigateCabi;
import com.wanhuchina.lock.model.cabinet.WeigateCabiExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeigateCabiMapper {
    int countByExample(WeigateCabiExample example);

    int deleteByExample(WeigateCabiExample example);

    int deleteByPrimaryKey(String cabiId);

    int insert(WeigateCabi record);

    int insertSelective(WeigateCabi record);

    List<WeigateCabi> selectByExample(WeigateCabiExample example);

    WeigateCabi selectByPrimaryKey(String cabiId);

    int updateByExampleSelective(@Param("record") WeigateCabi record, @Param("example") WeigateCabiExample example);

    int updateByExample(@Param("record") WeigateCabi record, @Param("example") WeigateCabiExample example);

    int updateByPrimaryKeySelective(WeigateCabi record);

    int updateByPrimaryKey(WeigateCabi record);
}