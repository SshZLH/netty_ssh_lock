package com.wanhuchina.lock.dao;


import com.wanhuchina.lock.model.cabinet.WeigateCabinet;
import com.wanhuchina.lock.model.cabinet.WeigateCabinetExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeigateCabinetMapper {
    int countByExample(WeigateCabinetExample example);

    int deleteByExample(WeigateCabinetExample example);

    int insert(WeigateCabinet record);

    int insertSelective(WeigateCabinet record);

    List<WeigateCabinet> selectByExample(WeigateCabinetExample example);

    int updateByExampleSelective(@Param("record") WeigateCabinet record, @Param("example") WeigateCabinetExample example);

    int updateByExample(@Param("record") WeigateCabinet record, @Param("example") WeigateCabinetExample example);
/**
 * 自定义接口
 */

	WeigateCabinet selByCabinetId(@Param("cabinetId")String cabinetId);
	

	WeigateCabinet selByCabinetNoAndCabinetDoorNo(WeigateCabinet weigateCabinet);


}