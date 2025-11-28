package com.codingshuttle.assignment.one.frosting;

import com.codingshuttle.assignment.one.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("choc")
@ConditionalOnProperty(name = "frosting.type", havingValue = "choc")
public class ChocolateFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("Hello I am chocolate frosting");
    }
}
