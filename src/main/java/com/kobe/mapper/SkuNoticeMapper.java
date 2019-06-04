package com.kobe.mapper;

import com.kobe.entity.SkuNotice;
import com.kobe.entity.SkuNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkuNoticeMapper {
    /**
     *
     * @mbggenerated 2019-04-02
     */
    int countByExample(SkuNoticeExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int deleteByExample(SkuNoticeExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int insert(SkuNotice record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int insertSelective(SkuNotice record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    List<SkuNotice> selectByExample(SkuNoticeExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    SkuNotice selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByExampleSelective(@Param("record") SkuNotice record, @Param("example") SkuNoticeExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByExample(@Param("record") SkuNotice record, @Param("example") SkuNoticeExample example);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByPrimaryKeySelective(SkuNotice record);

    /**
     *
     * @mbggenerated 2019-04-02
     */
    int updateByPrimaryKey(SkuNotice record);
}