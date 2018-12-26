package com.kobe.controller;

import com.kobe.entity.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Binding;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@Api(description = "页面跳转")
@RequestMapping
public class PageController {
	@GetMapping
	public ModelAndView jsp() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jsp");
		return modelAndView;
	}

	@PostMapping("/uploads")
	@ApiOperation(value = "上传多个文件")
	public String uploads(@RequestParam MultipartFile[] files) throws IOException {
		int length = files.length;
		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				file.transferTo(new File("D:\\" + file.getOriginalFilename()));
			}
		}
		return "suc";
	}

	@PostMapping("/uploadsss")
	@ApiOperation(value = "上传文件")
	public String upload(@RequestParam MultipartFile file) throws IOException {
		file.transferTo(new File("D:\\" + file.getOriginalFilename()));
		return "suc";
	}

	@RequestMapping("/test")
	@ResponseBody
	@ApiOperation(value = "测试验证")
	public String test(@Valid @RequestBody Param param ,BindingResult result) throws Exception {
		boolean b = result.hasErrors();
		if (b){
			List<ObjectError> allErrors = result.getAllErrors();
			ObjectError objectError = allErrors.get(0);
			throw new Exception(objectError.getObjectName()+":"+objectError.getDefaultMessage());
		}
		return "suc";
	}
}
