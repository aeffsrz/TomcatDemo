package com.example.demo;
import static java.lang.Math.pow;

public class Util {
    public  static double result(double principleAmount,double interest,int years,int compoundingPeriod){
    return Math.round(principleAmount*pow(1+interest/compoundingPeriod,years*compoundingPeriod));
    }
}
