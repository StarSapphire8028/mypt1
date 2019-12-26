package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.Areainfo;
import com.qingao.app190806.springmvc190806.pojo.AreainfoExample;
import com.qingao.app190806.springmvc190806.pojo.GoodsinfoExample;
import com.qingao.app190806.springmvc190806.pojo.Orderlist;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface App_OrderList_Mapper {
	
	
	String sql_getSum="<script>SELECT  SUM(ol.gdcount*ol.price) FROM orderinfo odinfo JOIN orderlist ol ON odinfo.ofid=ol.ofid WHERE odinfo.ofid=#{orderinfid}</script>";
	
	List<Orderlist>  getOrderLists(List ctids);
	    
    
	@Select(value=sql_getSum)
	Double getSum(String orderinfid);
    
    
    
    
    
    
    
	
}