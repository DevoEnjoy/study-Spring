package com.example.ex00.dependency.qualifier.restaurant;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTests {
    @Autowired
    Restaurant restaurant;

    @Test
    public void RestauantTest(){
        log.info(String.valueOf(restaurant));
    }

}
