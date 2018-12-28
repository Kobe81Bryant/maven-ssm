package test;

import com.kobe.entity.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
    @Test
    public void test1() {
//        Map<String, Map<String, Map<Integer, List<BalanceOrders>>>> unionMaps =
// balanceOrders.stream().collect(Collectors.groupingBy(BalanceOrders::getCommissionPin,
//                Collectors.groupingBy(BalanceOrders::getFinishDate, Collectors.groupingBy(BalanceOrders::getOrderTypeJingTiao))));
        List<Orders> list = new ArrayList<>();
        Map<Date, List<Orders>> collect = list.stream().collect(Collectors.groupingBy(Orders::getPayDatetime));
        Map<Date, List<Orders>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Orders::getPayDatetime));

        Long a = new Long(3);
        Long b = new Long(3);
        System.out.println(a.longValue()==b.longValue());



        String regex = "([A-Z0-9a-z()_-]|[\\u4e00-\\u9fa5]|\\s)+";
        boolean matches = Pattern.matches(regex, "asd()（）反倒是感到十分的广泛的-");
        System.out.println(matches);

    }
}
