package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SchoolTest {

    @Autowired
    School school;

    @Autowired
    Class classes;

    @Autowired
    Student student;

    @Autowired
    Teacher teacher;

    @Test
    public void schoolTest(){
        log.info(String.valueOf(school));
    }
}
