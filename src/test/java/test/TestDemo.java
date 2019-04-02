package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.Pojo;
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
        Integer i=5;
        System.out.println(i.toString());

        String asd="null";
        List<Integer> list = JSON.parseArray(asd, Integer.class);
        System.out.println(list);
        System.out.println(asd);
    }
}

