package com.kobe.mapper;

import com.kobe.entity.Orders;
import com.kobe.entity.OrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {
    /**
     *
     * @mbggenerated 2018-12-09
     */
    int countByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int deleteByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int insert(Orders record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int insertSelective(Orders record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByPrimaryKey(Orders record);
}