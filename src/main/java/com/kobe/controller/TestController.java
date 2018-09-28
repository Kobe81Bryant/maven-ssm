package com.kobe.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
@Api(description="asd测试")
public class TestController {
	@GetMapping("/test")
    @ResponseBody
    @ApiOperation(value = "swarger第一个测试方法")
    public Map test1(){
        Map<String,Object>map=new HashMap<>();
        map.put("a",1);
        Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 2147483647; i++) {
					System.out.println("线程名称"+Thread.currentThread().getName()+"标识"+i);

				}
			}
		});
        thread.start();
//        for (int i = 0; i < 2147483647; i++) {
//			System.out.println("线程名称"+Thread.currentThread().getName()+"标识"+i);
//
//		}
        return map;
    }
}
