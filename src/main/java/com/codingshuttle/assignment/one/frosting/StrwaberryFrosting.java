package com.codingshuttle.assignment.one.frosting;

import com.codingshuttle.assignment.one.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("straw")
@ConditionalOnProperty(name = "frosting.type", havingValue = "straw")
public class StrwaberryFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("It's strawberry frosting !!");
    }
}
