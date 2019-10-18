package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kobe.entity.SkuNotice;
import com.kobe.entity.User;
import com.kobe.entity.UserEntity;
import com.kobe.mapper.UserMapper;
import com.kobe.service.FileService;
import com.kobe.utils.ESUtil;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.aspectj.weaver.SignatureUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.metrics.stats.InternalStats;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
@Log4j2
public class TestDemo {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void mybatistest(){
        System.out.println("1111111111111111");
        List<User> users = userMapper.selectByExample(null);
        log.info("xxxxx");
        log.info(JSON.toJSONString(users));
        users = userMapper.selectByExample(null);
        log.info(JSON.toJSONString(users));
        long l = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            User user=new User();
            user.setBirthday(new Date());
            user.setName(String.valueOf(i));
            user.setSex("n");
            userMapper.insertSelective(user);
        }
        long l1 = System.currentTimeMillis();
        System.out.println("共消耗"+(l1-l)/1000+"秒");
    }

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
        System.out.println(str1 == str2);
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

        MethodUtils.invokeMethod(userEntity, "repay", 4);


        Class<?> aClass = this.getClass().getClassLoader().loadClass("com.kobe.entity.UserEntity");

        System.out.println(aClass);
    }

//    @Autowired
//    private TransportClient client;

    @Test
    public void ESTest1() throws UnknownHostException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sformat = "yyyy-MM-dd HH:mm:ss";
        TermQueryBuilder commissionPin = QueryBuilders.termQuery("commissionPin", "dongdong3625202");
        RangeQueryBuilder submitDatetime = QueryBuilders.rangeQuery("submitDatetime").gte("2018-01-01 18:00:00").format(sformat);
        //近1天的
//        SearchResponse response =
//                client.prepareSearch("jingtiao").setTypes("effective_orders")
//                        .setQuery(QueryBuilders.boolQuery().filter(submitDatetime).filter(commissionPin)).setSize(0)
//                        .addAggregation(AggregationBuilders.stats("agg_commission").field("commission")).execute().actionGet();
//        InternalStats agg_commission = response.getAggregations().get("agg_commission");
//
//        response = client.prepareSearch("jingtiao").setTypes("effective_orders")
//                .setQuery(QueryBuilders.boolQuery().filter(submitDatetime).filter(commissionPin)).setSize(0).execute().actionGet();
//        System.out.println(JSON.toJSONString(response));
//        SearchResponse response = client.prepareSearch("jingtiao").setTypes("effective_orders")
//                .setQuery(QueryBuilders.boolQuery().filter(submitDatetime).filter(commissionPin))
//                .execute().actionGet();
//        SearchHits hits = response.getHits();
//        System.out.println(hits);
//        for (SearchHit hit : hits) {
//            System.out.println(log);
//            String id = hit.getId();
//            System.out.println(id);
//            System.out.println(hit.getSourceAsMap());
//        }
    }

    @Test
    public void logTest(){
        System.out.println(log);
        System.out.println(log);
        TestDemo.log.info("asdasdasdsadasd");
    }

}