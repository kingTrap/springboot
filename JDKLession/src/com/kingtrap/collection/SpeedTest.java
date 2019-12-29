package com.kingtrap.collection;

import java.util.ArrayList;
import java.util.List;

public class SpeedTest {

    private static void printListByFor(List<String> datas){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < datas.size(); i++) {
            System.out.println(datas.get(i));
        }
        System.out.println(System.currentTimeMillis()-startTime + "ms");
    }

    private static void printListByStream(List<String> datas){
        long startTime = System.currentTimeMillis();

        datas.stream().forEach(data-> System.out.println(data));

        System.out.println(System.currentTimeMillis()-startTime + "ms");

    }

    public static void main(String[] args) {
        List<String> datas = new ArrayList();
        for(int i=0;i<1000000;i++){
            datas.add(String.valueOf(i+1));
        }

        //printListByFor(datas);

        printListByStream(datas);
    }
}
