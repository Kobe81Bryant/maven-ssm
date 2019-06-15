package test;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class TestDemo2 {
    @Test
    public void test1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sformat = "yyyy-MM-dd HH:mm:ss";
        TermQueryBuilder commissionPin = QueryBuilders.termQuery("commissionPin", "asd");
        RangeQueryBuilder submitDatetime = QueryBuilders.rangeQuery("submitDatetime").gte("2019-01-01 18:00:00").format(sformat);
    }

    @Test
    public void test2() {
        String refer = "www.aa.com,www.bb.com";
        String url = "www.aa.com";

        System.out.println(refer.contains(url));
    }

    @Test
    public void test4() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    break;
                }
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }

            System.out.println();
        }
    }

    @Test
    public void test5() {
        Integer[] arr = {54, 76, 88, 45, 97, 32, 45, 13};
        Integer[] sort = sort(arr);
        System.out.println("输出结果");
        for (Integer integer : sort) {
            System.out.println(integer);
        }
    }
    //冒泡排序
    private Integer[] sort(Integer[] arr) {
        for (int i=0;i<arr.length-1;i++){
            System.out.println(i);
            System.out.println("第"+(i+1)+"趟");
            for (int j=0; j<arr.length-1-i;j++){
                System.out.println("第"+(i+1)+"趟的第"+(j+1)+"次");
                int tmp=0;
                if (arr[j]>arr[j+1]){
                    tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}
