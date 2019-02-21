package com.kobe.controller;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@Api(description = "页面跳转")
@RequestMapping
public class PageController {
	@GetMapping
	@ApiOperation(value = "首页跳转")
	public Map jsp() {
		Map map=new HashMap();
		map.put("appname","jiashu");
		map.put("type","小程序");
		map.put("sss","aaa");
		map.put("aaa","ssssssssss");
		return map;
	}

	@PostMapping("/fileUpload")
	@ApiOperation(value = "上传文件")
	public String upload(@RequestParam MultipartFile file) throws IOException {
		return "suc";
	}

	public static void main(String[] args) {
		String s = JSON.toJSONString(null);
	}
}
