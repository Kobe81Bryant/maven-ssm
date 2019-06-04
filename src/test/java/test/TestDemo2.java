package test;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class TestDemo2 {
    @Test
    public void test1(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sformat="yyyy-MM-dd HH:mm:ss";
        TermQueryBuilder commissionPin = QueryBuilders.termQuery("commissionPin", "asd");
        RangeQueryBuilder submitDatetime = QueryBuilders.rangeQuery("submitDatetime").gte("2019-01-01 18:00:00").format(sformat);
    }
}
