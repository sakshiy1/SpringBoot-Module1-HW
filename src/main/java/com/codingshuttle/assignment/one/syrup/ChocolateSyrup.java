package com.codingshuttle.assignment.one.syrup;

import com.codingshuttle.assignment.one.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("choc")
@ConditionalOnProperty(name = "syrup.type", havingValue = "choc")
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Hi It's chocolate Syrup");
    }
}
