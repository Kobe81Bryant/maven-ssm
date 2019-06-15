package com.kobe.controller;

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
    public Response getUserList(@RequestParam MultipartFile file) throws Exception {
        Response response = new Response();
        InputStream inputStream = file.getInputStream();
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheetAt = workbook.getSheetAt(0);
        Row row = sheetAt.getRow(1);
        Cell cell = row.getCell(10);
        int cellType = cell.getCellType();
        Date dateCellValue = cell.getDateCellValue();

        return response;
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

}
