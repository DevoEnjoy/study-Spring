package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class RestaurantTests {

    @Autowired
    Restaurant restaurant;

    @Test
    public void testRestaurant(){
        log.info(String.valueOf(restaurant));
    }
}
