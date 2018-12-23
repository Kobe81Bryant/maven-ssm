package com.kobe.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.Auti;

import java.util.List;

public interface AutiService {
    List<Auti> list();
    Auti selectById(Integer id);
    PageInfo<Auti>listByPage(Page page);
}
