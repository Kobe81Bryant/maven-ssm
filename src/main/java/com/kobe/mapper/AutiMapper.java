package com.kobe.mapper;

import com.kobe.entity.Auti;
import com.kobe.entity.AutiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutiMapper {
    /**
     *
     * @mbggenerated 2018-11-25
     */
    int countByExample(AutiExample example);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int deleteByExample(AutiExample example);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int insert(Auti record);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int insertSelective(Auti record);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    List<Auti> selectByExample(AutiExample example);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    Auti selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int updateByExampleSelective(@Param("record") Auti record, @Param("example") AutiExample example);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int updateByExample(@Param("record") Auti record, @Param("example") AutiExample example);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int updateByPrimaryKeySelective(Auti record);

    /**
     *
     * @mbggenerated 2018-11-25
     */
    int updateByPrimaryKey(Auti record);
}