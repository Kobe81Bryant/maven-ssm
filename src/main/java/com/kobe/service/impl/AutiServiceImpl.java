package com.kobe.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.Auti;
import com.kobe.entity.AutiExample;
import com.kobe.mapper.AutiMapper;
import com.kobe.service.AutiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutiServiceImpl implements AutiService {
    @Autowired
    private AutiMapper autiMapper;

    @Override
    public List<Auti> list() {
        List<Auti> autis = autiMapper.selectByExample(null);
        return autis;
    }

    @Override
    public Auti selectById(Integer id) {
        Auti auti = autiMapper.selectByPrimaryKey(id);
        return auti;
    }

    @Override
    public PageInfo<Auti> listByPage(Page page) {
        PageHelper.startPage(page.getPageNum(),page.getPageSize(),page.getOrderBy());
        List<Auti> autis = autiMapper.selectByExample(new AutiExample());
        PageInfo<Auti> info = new PageInfo<>(autis);
        return info;
    }
}
