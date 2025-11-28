package com.codingshuttle.assignment.one.syrup;

import com.codingshuttle.assignment.one.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("straw")
@ConditionalOnProperty(name = "syrup.type", havingValue = "straw")
public class StrawberrySyrup implements Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Hi I am strawberry Syrup");
    }
}
