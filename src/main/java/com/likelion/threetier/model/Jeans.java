package com.likelion.threetier.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Jeans implements Outfit{
    public String wear()
    {
        //ms = "Mac Jeans";
        //System.out.println("Mặc quần Jeans");
        //return ms;
        return "Mac quan jeans";
    }
}
