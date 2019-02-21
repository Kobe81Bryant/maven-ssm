package com.kobe.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.TbUser;
import com.kobe.entity.TbUserExample;
import com.kobe.mapper.TbUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(description = "页面跳转")
@RequestMapping
public class PageController {
	@Autowired
	private TbUserMapper tbUserMapper;
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

	@GetMapping("userList")
	public List<TbUser>getUserList(){
		TbUserExample tbUserExample=new TbUserExample();
		TbUserExample.Criteria criteria = tbUserExample.createCriteria();
		List<TbUser> tbUsers = tbUserMapper.selectByExample(tbUserExample);
		return tbUsers;
	}

	@GetMapping("userList")
	public PageInfo<TbUser>getUserListPage(@RequestParam(defaultValue = "1") Integer page,
									   @RequestParam(defaultValue = "3") Integer size){
		PageHelper.startPage(page,size);
		TbUserExample tbUserExample=new TbUserExample();
		TbUserExample.Criteria criteria = tbUserExample.createCriteria();
		List<TbUser> tbUsers = tbUserMapper.selectByExample(tbUserExample);
		PageInfo<TbUser>pageInfo=new PageInfo<>(tbUsers);
		return pageInfo;
	}

}
