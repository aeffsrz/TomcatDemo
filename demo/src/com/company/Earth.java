package com.company;

public class Earth {
    private static Earth earth = new Earth();
    private Earth(){

    }

    public static Earth getEarth(){
        return earth;
    }
}
