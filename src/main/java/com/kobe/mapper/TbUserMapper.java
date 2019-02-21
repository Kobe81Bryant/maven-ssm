package com.kobe.mapper;

import com.kobe.entity.TbUser;
import com.kobe.entity.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    /**
     *
     * @mbggenerated 2019-02-21
     */
    int countByExample(TbUserExample example);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int deleteByExample(TbUserExample example);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int insert(TbUser record);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int insertSelective(TbUser record);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    TbUser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     *
     * @mbggenerated 2019-02-21
     */
    int updateByPrimaryKey(TbUser record);
}