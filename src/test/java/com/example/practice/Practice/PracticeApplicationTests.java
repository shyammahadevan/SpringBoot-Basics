package com.example.practice.Practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class PracticeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void wss() {
        String str = "cdscdd";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character cha : str.toCharArray()) {
            Integer count = hashMap.get(cha);

            hashMap.put(cha, count == null ? 1 : count + 1);
        }

        System.out.println(hashMap);

    }

}
