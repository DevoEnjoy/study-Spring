package com.example.ex00.dependency.qualifier.restaurant;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
@Qualifier("vips")
public class Vips implements Restaurant {

    private int price = Restaurant.price - 10000;

    @Override
    public final boolean isSalad() {
        return true;
    }
}
