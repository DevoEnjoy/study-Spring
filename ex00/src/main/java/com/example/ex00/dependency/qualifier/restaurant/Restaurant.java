package com.example.ex00.dependency.qualifier.restaurant;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

public interface Restaurant {
    int price = 30000;
    public boolean isSalad();
}
