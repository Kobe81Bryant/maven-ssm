package com.kobe.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.Auti;
import com.kobe.service.AutiService;
import com.kobe.vo.PageVo;
import com.kobe.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
@Api(description="asdasd")
public class TestController {
    @Autowired
    private AutiService autiService;

	@SuppressWarnings("rawtypes")
	@GetMapping("/test")
    @ResponseBody
    @ApiOperation(value = "swarger第一个测试方法")
    public Map test1(){
        Map<String,Object>map=new HashMap<>();
        map.put("a",1);
//        Thread thread=new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 2147483647; i++) {
//					System.out.println("线程名称"+Thread.currentThread().getName()+"标识"+i);
//
//				}
//			}
//		});
//        thread.start();
        return map;
    }
    @ApiOperation(value = "获取权限列表")
    @GetMapping("/list")
    @ResponseBody
    public List<Auti>list(){
        List<Auti> list = autiService.list();
        return list;
    }

    @ApiOperation(value = "获取单个权限")
    @GetMapping("/selectById")
    @ResponseBody
    public Auti selectById(@ApiParam(name = "id",value = "主键") @RequestParam Integer id){
        Auti auti = autiService.selectById(id);
        return auti;
    }

    @ApiOperation(value = "分页获取权限")
    @GetMapping("/selectByPage")
    @ResponseBody
    public PageInfo<Auti> selectByPage(PageVo page){
        Page page1=new Page();
        page1.setPageNum(page.getPageNum());
        page1.setPageSize(page.getPageSize());
        page.setOrderBy("type desc");
        PageInfo<Auti> autiPageInfo = autiService.listByPage(page1);
        return autiPageInfo;
    }

    @ApiOperation(value = "测试lombok")
    @GetMapping("/testLombok")
    public User testUser(){
        User user=new User();
        user.setFee(new BigDecimal("20"));
        user.setId(123);
        user.setName("asdasdf");
        return user;
    }
}
