package com.homework.homework;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType(){
        return "strawbeery syrup";
    }

}
