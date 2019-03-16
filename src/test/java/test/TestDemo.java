package test;

import org.junit.Test;

import java.util.*;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {
    @Test
    public void test1() {
        Map<Integer,List<Integer>>treeMap=new TreeMap<>();
        Integer[] arr=new Integer[]{23,755,24,755,755,755};
        for (int i=0;i<arr.length;i++) {
            List<Integer> integers = treeMap.get(arr[i]);
            if (integers==null){
                integers=new ArrayList<>();
                integers.add(i);
            }else {
                integers.add(i);
            }
            treeMap.put(arr[i],integers);
        }

        Set<Integer> integers = treeMap.keySet();

        List<Integer>list=new ArrayList<>(integers);
        Integer min = list.get(0);
        Integer key = list.get(list.size()-1);

        List<Integer> integerList = treeMap.get(key);
        List<Integer> minList = treeMap.get(min);

        System.out.println(integerList);


        System.out.println(minList);

    }
}

