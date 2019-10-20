package com.kobe.mapper;

import com.kobe.annotation.DaoCache;
import com.kobe.entity.User;
import com.kobe.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2019-10-10
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    @DaoCache(cacheKey = "asd")
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2019-10-10
     */
    int updateByPrimaryKey(User record);
}