package com.wanhuchina.lock.dao;

import com.wanhuchina.lock.model.cabinet.WeigateCabinetRecord;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeigateCabinetRecordMapper {
    int countByExample(WeigateCabinetRecordExample example);

    int deleteByExample(WeigateCabinetRecordExample example);

    int deleteByPrimaryKey(String careId);

    int insert(WeigateCabinetRecord record);

    int insertSelective(WeigateCabinetRecord record);

    List<WeigateCabinetRecord> selectByExample(WeigateCabinetRecordExample example);

    WeigateCabinetRecord selectByPrimaryKey(String careId);

    int updateByExampleSelective(@Param("record") WeigateCabinetRecord record, @Param("example") WeigateCabinetRecordExample example);

    int updateByExample(@Param("record") WeigateCabinetRecord record, @Param("example") WeigateCabinetRecordExample example);

    int updateByPrimaryKeySelective(WeigateCabinetRecord record);

    int updateByPrimaryKey(WeigateCabinetRecord record);
}