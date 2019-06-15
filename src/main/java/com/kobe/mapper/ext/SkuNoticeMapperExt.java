package com.kobe.mapper.ext;

import com.kobe.mapper.SkuNoticeMapper;

import java.util.List;

public interface SkuNoticeMapperExt extends SkuNoticeMapper {
    List<String>getNames();
}
