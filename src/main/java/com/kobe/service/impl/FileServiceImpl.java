package com.kobe.service.impl;

import com.alibaba.fastjson.JSON;
import com.kobe.service.FileService;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class FileServiceImpl implements FileService{
    @Value("${QINIU_ACCESS_KEY}")
    private String QINIU_ACCESS_KEY;
    @Value("${QINIU_SECRET_KEY}")
    private String QINIU_SECRET_KEY;
    @Value("${QINIU_BUCKET_NAME}")
    private String QINIU_BUCKET_NAME;
    @Value("${QINIU_FILE_PRE}")
    private String QINIU_FILE_PRE;
    @Override
    public String uploadFile(MultipartFile file) throws Exception{
        String fileName = System.currentTimeMillis() + file.getOriginalFilename();
        Configuration cfg = new Configuration(Zone.zone1());
        UploadManager uploadManager=new UploadManager(cfg);
        Auth auth = Auth.create(QINIU_ACCESS_KEY, QINIU_SECRET_KEY);
        String uploadToken = auth.uploadToken(QINIU_BUCKET_NAME);
        Response response = uploadManager.put(file.getBytes(), fileName, uploadToken);
        Map<String,String> map = JSON.parseObject(response.bodyString(), Map.class);
        String key = map.get("key");
        return QINIU_FILE_PRE+key;
    }
}
