package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.Areainfo;
import com.qingao.app190806.springmvc190806.pojo.AreainfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface App_AreaInfo_Mapper {
	
	List<Map>  getAreaInformations(AreainfoExample example, RowBounds rowBounds);
	
}