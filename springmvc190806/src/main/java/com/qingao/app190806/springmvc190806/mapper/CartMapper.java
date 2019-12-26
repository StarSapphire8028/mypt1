package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.Cart;
import com.qingao.app190806.springmvc190806.pojo.CartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CartMapper {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExampleWithRowbounds(CartExample example, RowBounds rowBounds);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}