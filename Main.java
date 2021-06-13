package com.company;

public class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level myVar = Level.MEDIUM;

        SomeFunction(myVar);

    }

    public static void SomeFunction(Level level){

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }

}
