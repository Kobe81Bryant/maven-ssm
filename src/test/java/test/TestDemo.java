package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.SkuNotice;
import com.kobe.service.FileService;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
public class TestDemo {
    //    @Autowired
//    private FileService fileService;
    @Test
    public void test1() throws ParseException {
        String s1="a";
        String s2="b";
        String s3="c";
        String s4="c";

        StringBuilder builder=new StringBuilder("asd");

        System.out.println(builder.append(s1).append(s2));

    }
}

