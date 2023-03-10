package com.example.ex00.dependency.qualifier.restaurant;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
@Qualifier("outback") @Primary
public class Outback implements Restaurant {

    private int price = Restaurant.price + 20000;

    @Override
    public final boolean isSalad() {
        return false;
    }
}
