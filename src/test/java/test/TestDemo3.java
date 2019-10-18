package test;

import com.alibaba.fastjson.JSON;
import com.kobe.utils.ESUtil;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;

import javax.management.Query;
import java.net.UnknownHostException;
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
}
