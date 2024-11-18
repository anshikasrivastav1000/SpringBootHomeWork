package com.homework.homework;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrostring implements Frosting{
@Override
    public String getFrostingType(){
        return "strawberry frosting";
    }
}
