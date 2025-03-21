package com.design_patterns.demo.creational.builder.example1;


public class ComputerBuilderDirector {

    public Computer getBasicComputer() {
        return new Computer.Builder("2GB", "2TB", "Intel i7").build();
    }

    public Computer getGraphicsCardEnabledComputer() {
        return new Computer.Builder("2GB", "2TB", "Intel i7").setGraphicsCardEnabled(true).build();
    }
}
