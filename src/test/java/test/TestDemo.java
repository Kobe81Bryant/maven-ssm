package test;

import org.junit.Test;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
    @Test
    public void test1() {

        String s="ygfuegfs.jpg";
        String[] split = s.split("\\.");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}

