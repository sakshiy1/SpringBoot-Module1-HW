package com.codingshuttle.assignment.one;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private Frosting frosting;

    private Syrup syrup;

    public CakeBaker(Frosting frosting,Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }


    public void bakeCake() {
        System.out.println("baking cake with");
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
