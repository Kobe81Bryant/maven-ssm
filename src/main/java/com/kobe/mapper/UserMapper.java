package com.kobe.mapper;

import com.kobe.entity.User;
import com.kobe.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-12-09
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-12-09
     */
    int updateByPrimaryKey(User record);
}