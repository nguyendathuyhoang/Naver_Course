package com.likelion.threetier.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    public
    Outfit outfit;

    public Girl()
    {

    }

    public void setOutfit(Outfit outfit)
    {
        this.outfit=outfit;
    }
}
