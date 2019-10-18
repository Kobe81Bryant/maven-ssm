package com.kobe.service.impl;

import com.alibaba.fastjson.JSON;
import com.kobe.entity.User;
import com.kobe.mapper.UserMapper;
import com.kobe.service.FileService;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
@Log4j2
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

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void testMybatis() {
        List<User> users = userMapper.selectByExample(null);
        log.info(JSON.toJSONString(users));
        log.info("======");
        users = userMapper.selectByExample(null);
        log.info(JSON.toJSONString(users));
    }
}
