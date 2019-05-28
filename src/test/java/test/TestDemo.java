package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.SkuNotice;
import com.kobe.entity.UserEntity;
import com.kobe.service.FileService;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "c";

        StringBuilder builder = new StringBuilder("asd");

        System.out.println(builder.append(s1).append(s2));

    }

    @Test
    public void test2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("外层第" + i + "次循环");
            for (int j = 1; j <= 2; j++) {
                System.out.println("内层第" + j + "次循环");
                break;
            }

        }
    }


    @Test
    public void test3() {
        Short a = 1;
        Short b = 1;
        System.out.println(1 == a);
        System.out.println(a == 1);
        System.out.println(a.equals(1));

        Integer i = 1;
        System.out.println(i.equals(1));


        String s = "s";
        String ss = "s";
        System.out.println("++++++++++");
        System.out.println(s == ss);
        System.out.println(s.equals("s"));

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }


    @Test
    public void test4() throws Throwable {
        Class<UserEntity> userEntityClass = UserEntity.class;
        UserEntity userEntity = userEntityClass.newInstance();

        //int money = userEntity.getMoney();

//        Method getMoney = userEntityClass.getMethod("getMoney");
//        Object invoke = getMoney.invoke(userEntity);
//        System.out.println(invoke);

//        Method repay = userEntityClass.getMethod("repay", int.class);
//        repay.invoke(userEntity,200000);

        MethodUtils.invokeMethod(userEntity,"repay",4);


        Class<?> aClass = this.getClass().getClassLoader().loadClass("com.kobe.entity.UserEntity");

        System.out.println(aClass);
    }

}