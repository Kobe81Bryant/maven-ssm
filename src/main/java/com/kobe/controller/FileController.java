package com.kobe.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.TbUser;
import com.kobe.entity.TbUserExample;
import com.kobe.mapper.TbUserMapper;
import com.kobe.service.FileService;
import com.kobe.vo.Response;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(description = "文件服务")
@RequestMapping
public class FileController {
	@Autowired
	private TbUserMapper tbUserMapper;
	@Autowired
	private FileService fileService;
	@GetMapping
	public Map index() {
		Map map=new HashMap();
		map.put("appname","jiashu");
		map.put("type","小程序");
		map.put("sss","aaa");
		map.put("aaa","ssssssssss");
		return map;
	}

	@PostMapping("/fileUpload")
	@ApiOperation(value = "上传文件")
	public Response<String> upload(@RequestParam MultipartFile file) throws Exception {
		Response<String> response=new Response<>();
		String url = fileService.uploadFile(file);
		response.setData(url);
		return response;
	}

	@GetMapping("/userList")
	@ApiOperation(value = "用户列表")
	public List<TbUser>getUserList(){
		TbUserExample tbUserExample=new TbUserExample();
		TbUserExample.Criteria criteria = tbUserExample.createCriteria();
		List<TbUser> tbUsers = tbUserMapper.selectByExample(tbUserExample);
		return tbUsers;
	}

	@GetMapping("/userListPage")
	@ApiOperation(value = "用户列表分页")
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
