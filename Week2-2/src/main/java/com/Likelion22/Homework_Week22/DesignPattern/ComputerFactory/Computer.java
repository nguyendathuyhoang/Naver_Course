package com.Likelion22.Homework_Week22.DesignPattern.ComputerFactory;

public abstract class Computer {
    public abstract String getType();
    @Override
    public String toString()
    {
        return this.getType();
    }
}
