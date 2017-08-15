package com.wanhuchina.lock.dao;


import com.wanhuchina.lock.model.order.WhcOrder;
import com.wanhuchina.lock.model.order.WhcOrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhcOrderMapper {
    int countByExample(WhcOrderExample example);

    int deleteByExample(WhcOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(WhcOrder record);

    int insertSelective(WhcOrder record);

    List<WhcOrder> selectByExample(WhcOrderExample example);

    WhcOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") WhcOrder record, @Param("example") WhcOrderExample example);

    int updateByExample(@Param("record") WhcOrder record, @Param("example") WhcOrderExample example);

    int updateByPrimaryKeySelective(WhcOrder record);

    int updateByPrimaryKey(WhcOrder record);
}