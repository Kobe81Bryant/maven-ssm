package test;

import com.kobe.entity.Pojo;
import com.kobe.service.FileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
public class TestDemo {
    @Autowired
    private FileService fileService;
    @Test
    public void test1() throws ParseException {
        System.out.println(fileService);
        int i = fileService.hashCode();
        System.out.println(i);
    }
}

