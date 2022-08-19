package com.likelion.threetier.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Short implements Outfit {
    public String wear()
    {
        return "Mac quan short";
    }
}
