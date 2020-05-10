package test;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kobe.entity.SkuNotice;
import com.kobe.utils.ESUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.DirectSchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.management.Query;
import java.io.*;
import java.math.BigDecimal;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeoutException;

public class TestDemo3 {
    @Test
    public void test1() throws UnknownHostException {
        TransportClient client = ESUtil.getClient();
        GetResponse response = client.prepareGet(".kibana", "config", "5.2.0").execute().actionGet();
        System.out.println(JSON.toJSONString(response));
        Map<String, Object> sourceAsMap = response.getSourceAsMap();
        for (String s : sourceAsMap.keySet()) {
            System.out.println(sourceAsMap.get(s));
        }
        QueryBuilders.rangeQuery("asd").gte("asd").lte("asd");
    }

    @Test
    public void test2() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String yearStr = format.format(now);
        String yearStart = yearStr + "-01-01";
        String yearEnd = yearStr + "-12-31";
        System.out.println("======");
    }

    @Test
    public void test3() {
        for (int j = 0; j < 10000; j++) {
            Integer i = (int) ((Math.random() * 9 + 1) * 100000);
            System.out.println(i.toString());
        }
    }

    @Test
    public void test4() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("", "", "");
        conn.setAutoCommit(false);
        Statement statement = conn.createStatement();
        boolean execute = statement.execute("");
        conn.commit();
    }


    @Test
    public void test5() throws ClassNotFoundException, SQLException {
        Integer leftSecends = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String x = "2019-11-07 15:53:01";
        try {
            Date exp = format.parse(x);
            long l = (exp.getTime() - new Date().getTime()) / 1000;
            Long aLong = new Long(l);
            leftSecends = aLong.intValue();
            System.out.println(leftSecends);
        } catch (ParseException e) {
        }

    }

    @Test
    public void upload() throws Exception {
        File f1 = new File("D:\\Picture\\cedoH5R.jpg");
        File f2 = new File("D:\\Doc\\informix9.jar");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpHeaders headers = new HttpHeaders();
        FileSystemResource fileSystemResource1 = new FileSystemResource(f1);
        FileSystemResource fileSystemResource2 = new FileSystemResource(f2);
        List<FileSystemResource> list = new ArrayList<>();
        list.add(fileSystemResource1);
        list.add(fileSystemResource2);
        MediaType type = MediaType.parseMediaType("multipart/form-data");
        headers.setContentType(type);
        //构建请求体
        MultiValueMap<String, Object> form = new LinkedMultiValueMap<String, Object>();
        form.add("sys_name", "ldzhapp");
        form.add("sys_secret", System.currentTimeMillis());
        form.add("req_id", System.currentTimeMillis());
        form.add("sign", System.currentTimeMillis());
        form.add("file_catelog", "cw");
        form.add("base_dir", "cwfiles");
        form.add("file_list[0].file", fileSystemResource1);
        //form.add("file_list[1].file", fileSystemResource2);
        //封装请求
        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(form, headers);
        //发送请求
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://127.0.0.1:8080/fileserver/upload", request, String.class);//发送
        String result = stringResponseEntity.getBody().toString();
        JSONObject jsonObject = JSON.parseObject(result);
        JSONArray res_list = jsonObject.getJSONArray("res_list");
        JSONObject o = (JSONObject) res_list.get(0);
        Integer id = Integer.valueOf(o.getString("id"));
        System.out.println(result);
    }

    @Test
    public void download() throws Exception {
        String sys_name = "测试系统";
        String sys_secret = "123456";
        String req_id = "11111222223334";
        String sign = "789465123456";
        String resource_id = "71";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        HttpHeaders headers = new HttpHeaders();
        //发送请求
        String url = "http://127.0.0.1:8080/fileserver/download?sys_name=" + sys_name
                + "&sys_secret=" + sys_secret
                + "&req_id=" + req_id
                + "&sign=" + sign
                + "&resource_id=" + resource_id;
        ResponseEntity<byte[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                new HttpEntity<byte[]>(headers),
                byte[].class);

        HttpStatus statusCode = response.getStatusCode();
        byte[] body = response.getBody();
        InputStream inputStream = new ByteArrayInputStream(body);


    }

    @Test
    public void test6() {
        SkuNotice skuNotice1 = new SkuNotice();
        SkuNotice skuNotice2 = new SkuNotice();
        BeanUtils.copyProperties(skuNotice1, skuNotice2, "aaa", "aaa");

    }

    @Test
    public void test7() {
        String str = "CW277eab760e3e28d465ea78098c2c1ee67000113092719911215271118701100183京X1234510000000000012";
        System.out.println(str.length());
    }

    @Test
    public void test8() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date start = format.parse(format.format(new Date()));
        int i = Integer.valueOf(format.format(new Date())) + 1;
        Date end = format.parse(String.valueOf(i));
        System.out.println(end);

    }

    @Test
    public void test9() {
        System.out.println(maskCode("1234567"));
        System.out.println(maskCode("12345678"));
        System.out.println(maskCode("123456789"));
        System.out.println(maskCode("1234567890"));
        System.out.println(maskCode("12345678901"));
        System.out.println(maskCode("123456789012"));
    }


    //处理7到20位数据
    //保留头部和尾部
    private String maskCode(String code) {
        //处理7到20位数据
        //保留头部和尾部
        if (code == null) {
            return null;
        }
        if (code.length() < 7) {
            return code;
        }
        if (code.length() <= 8) {
            return code.substring(0, 3) + "**" + code.substring(5, code.length());
        }
        if (code.length() > 8) {
            return code.substring(0, 3) + "***" + code.substring(6, code.length());
        }
        return null;
    }


    private void fake() {
        /**
         * 上线前提条件：
         * 运营人员正确设置是否使有有效期
         */
       /* if (匹配电子码==true){
            if (自动生成==true){
                if (有有效期==true){
                    //处理
                    有效期走电子码的有效期
                    return 有效期；
                }
            }
        }
        //走原有的有效期设置逻辑
        return 原有有效期逻辑得到的有效期;*/
    }

    @Test
    public void test10() throws Exception {
        String formatStr = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal1 = Calendar.getInstance();
        /*cal1.set(Calendar.YEAR, 2020);
        cal1.set(Calendar.MONTH, 3);
        cal1.set(Calendar.DAY_OF_MONTH, 14);*/
        cal1.setTime(new Date());
        cal1.add(Calendar.DAY_OF_MONTH, -1);
        cal1.add(Calendar.DAY_OF_YEAR, -1);

        Date date = cal1.getTime(); //获取昨天日期
        System.out.println(format.format(date));
    }


    @Test
    public void test11() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        List<String> list = new ArrayList<String>();
        //list.add("2011-12-01 2011-12-06");
//        list.add("2011-12-2 2011-12-4");
//        list.add("2011-12-4 2011-12-7");
        list.add("2020-04-01 2020-04-15");
        list.add("2020-04-02 2020-04-15");
        try {
            for (int i = 0; i < list.size(); i++) {
                String d1[] = list.get(i).split(" ");
                Date startdate1 = formater.parse(d1[0]);
                Date enddate1 = formater.parse(d1[1]);
                for (int j = i + 1; j < list.size(); j++) {
                    String d2[] = list.get(j).split(" ");
                    Date startdate2 = formater.parse(d2[0]);
                    Date enddate2 = formater.parse(d2[1]);
                    if (!startdate2.before(startdate1)) {
                        if (!startdate2.after(enddate1)) {
                            System.out.println("第"+(i+1)+"条数据"+list.get(i) + "与第" +(j+1)+"条数据"+ list.get(j) + "重合;");
                        }
                    } else if (!enddate2.before(startdate1)) {
                        System.out.println("第"+(i+1)+"条数据"+list.get(i) + "与第" +(j+1)+"条数据"+ list.get(j) + "重合;");
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test12(){
        BigDecimal b1 = new BigDecimal("0");
        BigDecimal b2 = new BigDecimal("2");
        System.out.println(b1.compareTo(BigDecimal.ZERO));
    }

    @Test
    public void test13() throws FileNotFoundException {
        String filename = "D:\\Projects\\ComProjects\\ldzhapp_repos\\ldzhapp//dzmfile//158788474177892902.xlsx";
        File file = new File(filename);
        FileOutputStream fileOut = new FileOutputStream(file);
    }
}
