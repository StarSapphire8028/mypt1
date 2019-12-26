package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.Areainfo;
import com.qingao.app190806.springmvc190806.pojo.AreainfoExample;
import com.qingao.app190806.springmvc190806.pojo.GoodsinfoExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface App_GoodsInfo_Mapper {
	
	String sql_goodsDetail="SELECT goods.gdid,goods.gdname,img.gimgurl,gprice.price FROM goodsinfo goods "
			+ " JOIN goodsimage img ON goods.gdid=img.gdid  "
			+ " JOIN goodsprice gprice ON goods.gdid=gprice.gdid "
			+ " WHERE gprice.utid=1 AND img.gimgtype=1 AND goods.gdid=#{gdid}";
	
	
	
	List<Map>  getGoodsInformations(GoodsinfoExample example, RowBounds rowBounds);
	

    long countByExample(GoodsinfoExample example);
	
    @Select("<script>"+sql_goodsDetail+"</script>")
    Map getGoodsDetailByGdid(Integer gdid);
    
    
    
    
    
    
    
    
    
	
}