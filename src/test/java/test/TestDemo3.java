package test;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.kobe.utils.ESUtil;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;

import javax.management.Query;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

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
    public void test2(){
        Date now =new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy");
        String yearStr = format.format(now);
        String yearStart= yearStr+"-01-01";
        String yearEnd= yearStr+"-12-31";
        System.out.println("======");
    }

    @Test
    public void test3(){
        for (int j=0;j<10000;j++){
            Integer i = (int) ((Math.random() * 9 + 1) * 100000);
            System.out.println(i.toString());
        }
    }

    @Test
    public void test4() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("", "", "");
        Statement statement = conn.createStatement();
        boolean execute = statement.execute("");
        conn.commit();
    }


    @Test
    public void test5() throws ClassNotFoundException, SQLException {
        Integer leftSecends = null;
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String x ="2019-11-07 15:53:01";
        try {
            Date exp = format.parse(x);
            long l = (exp.getTime() - new Date().getTime())/1000;
            Long aLong = new Long(l);
            leftSecends =aLong.intValue();
            System.out.println(leftSecends);
        } catch (ParseException e) {
        }

    }
}
