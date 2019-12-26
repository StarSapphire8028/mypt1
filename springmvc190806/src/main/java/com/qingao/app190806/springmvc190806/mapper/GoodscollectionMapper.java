package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.GoodscollectionExample;
import com.qingao.app190806.springmvc190806.pojo.GoodscollectionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodscollectionMapper {
    long countByExample(GoodscollectionExample example);

    int deleteByExample(GoodscollectionExample example);

    int deleteByPrimaryKey(GoodscollectionKey key);

    int insert(GoodscollectionKey record);

    int insertSelective(GoodscollectionKey record);

    List<GoodscollectionKey> selectByExampleWithRowbounds(GoodscollectionExample example, RowBounds rowBounds);

    List<GoodscollectionKey> selectByExample(GoodscollectionExample example);

    int updateByExampleSelective(@Param("record") GoodscollectionKey record, @Param("example") GoodscollectionExample example);

    int updateByExample(@Param("record") GoodscollectionKey record, @Param("example") GoodscollectionExample example);
}