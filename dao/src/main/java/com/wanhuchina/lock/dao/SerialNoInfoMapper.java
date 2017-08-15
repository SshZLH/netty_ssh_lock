package com.wanhuchina.lock.dao;


import com.wanhuchina.lock.model.common.DBresult;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerialNoInfoMapper {
	List<DBresult> selAllInfo();
}
