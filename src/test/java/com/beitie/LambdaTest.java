package com.beitie;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest {
    @Test
    public void reduceTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
    /**
     * 描述:
     * @param
     * @Author: wtj
     * @Date: 2023-10-21 15:49
     */
    @Test
    public void mapTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list3 = new ArrayList<>();
//        List<Integer> listAdd = list.stream().map(LambdaTest::mapFz).collect(Collectors.toList());
//        System.out.println(reduceFz(listAdd));

        List<Integer> listAdd2 = list.stream().map(s -> {
            s = s + 2;
            list3.add(s);
            return s;
        }).collect(Collectors.toList());
        System.out.println(listAdd2);
        System.out.println(list3);
    }
    @Test
    public void foreachTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = new ArrayList<>();
        list.stream().forEach(a -> list2.add(a + 1));
        System.out.println(list2);
        System.out.println(reduceFz(list2));
    }


    public static Integer mapFz(Integer a) {
        return a + 1;
    }
    public int reduceFz(List<Integer> list) {
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        return sum;
    }

}
