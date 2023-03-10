package com.example.ex00.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class School {
    private List<Class> classes;
    private List<Teacher> teachers;
}
