package com.kobe.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.User;
import com.kobe.mapper.UserMapper;
import com.kobe.service.FileService;
import com.kobe.vo.Response;
import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(description = "文件服务")
@RequestMapping
@Log4j2
public class FileController {
    //public static final Logger loger = LogManager.getLogger(FileController.class);
    @Autowired
    private FileService fileService;
    @GetMapping
    public Map index() {
        Map map = new HashMap();
        map.put("appname", "jiashu");
        map.put("type", "小程序");
        return map;
    }

    @PostMapping("/fileUpload")
    @ApiOperation(value = "上传文件")
    public Response<String> upload(@RequestParam MultipartFile file) throws Exception {
        Response<String> response = new Response<>();
        String url = fileService.uploadFile(file);
        response.setData(url);
        return response;
    }

    @PostMapping("/excelUpload")
    @ApiOperation(value = "excel上传")
    public void getUserList(@RequestParam MultipartFile file) throws Exception {
        InputStream inputStream = file.getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheetAt = workbook.getSheetAt(0);
        int lastRowNum = sheetAt.getLastRowNum();
        SimpleDateFormat fromFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat toFormat = new SimpleDateFormat("yyyy-MM-dd");
        String sql ="update ldzh_dzm set invaliddate={0}, validdate={1} where giftbuyid={2} and cardtype={3};";
        for (int i=1;i<=lastRowNum;i++){
            Row row = sheetAt.getRow(i);
            if (row==null){
                break;
            }
            Cell cell = row.getCell(0);
            if (cell==null){
                break;
            }
            String s1 = row.getCell(0).getRichStringCellValue().getString();
            String s2 = row.getCell(2).getRichStringCellValue().getString();
            String s3 = row.getCell(5).getRichStringCellValue().getString();
            String s4 = row.getCell(6).getRichStringCellValue().getString();
            String p1 = s1;
            String p2 = "'"+s2+"'";
            String p3 ="'"+toFormat.format(fromFormat.parse(s3))+"'";
            String p4 ="'"+toFormat.format(fromFormat.parse(s4))+"'";

            String format = MessageFormat.format(sql, p3, p4, p1, p2);
            System.out.println(format);
        }

        //response.setData(s);
    }

    @PostMapping("/test")
    @ApiOperation(value = "excel上传")
    public Response test(@RequestBody String[] ids) throws Exception {
        Response response = new Response();
        response.setMessage("" + ids.length);
        return response;
    }

    @PostMapping("/testl")
    @ApiOperation(value = "测试long")
    public Response testLong(Long l) throws Exception {
        Response response = new Response();
        return response;
    }

    @PostMapping("/test2")
    @ApiOperation(value = "测试long")
    public Response test2(){
        Response response = new Response();
        log.info("asdasdasdas");
        return response;
    }

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/testmybatis")
    @ApiOperation(value = "测试mybatis")
    public Response testmybatis(){
        Response response = new Response();
        fileService.testMybatis();
        return response;
    }

    @PostMapping("/testPage")
    @ApiOperation(value = "测试分页")
    public PageInfo<User> getUseBypage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectByExample(null);
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }

}
