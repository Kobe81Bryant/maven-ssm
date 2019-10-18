package com.kobe.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    public String uploadFile(MultipartFile file) throws Exception;

    public void testMybatis();
}
