package com.kobe.controller;

import com.alibaba.fastjson.JSON;
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
        Sheet sheetAt = workbook.getSheetAt(1);
        int lastRowNum = sheetAt.getLastRowNum();
        String s="";
        for (int i=1;i<=lastRowNum;i++){
            Row row = sheetAt.getRow(i);
            //INSERT INTO czj2019_plan_gift_test (id, planid, cardtype, cardtypename, totalamount, displayno, gifttype, inserttimeforhis, operatetimeforhis) VALUES
            // (seq_czj2019_plan_gift.nextval, 10000000000103, '1208', '易修车 499元特惠价壳牌全合成保养套餐', 1000, 1, '0',current, current);
            double numericCellValue = row.getCell(6).getNumericCellValue();
            long id = new Double(numericCellValue).longValue();
            String cartType = row.getCell(2).getStringCellValue();
            String name = row.getCell(0).getStringCellValue();
            double numericCellValue1 = row.getCell(1).getNumericCellValue();
            long num = new Double(numericCellValue1).longValue();
            double numericCellValue2 = row.getCell(7).getNumericCellValue();
            long displayNo = new Double(numericCellValue2).longValue();
            String s1 = row.getCell(8).getStringCellValue();
            String type =s1.equalsIgnoreCase("电子类")?"0":"1";

            String sql="INSERT INTO czj2019_plan_gift (id, planid, cardtype, cardtypename, totalamount, displayno, gifttype, inserttimeforhis, operatetimeforhis) VALUES " +
                    "(seq_czj2019_plan_gift.nextval,"+id+",'"+cartType+"',"+"'"+name+"',"+num+","+displayNo+",'"+type+"',"+"current, current);";
            //System.out.println("======"+i);
            System.out.println(sql);
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

}
