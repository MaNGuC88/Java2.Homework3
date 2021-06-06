package com.geektech;

public class LimitException extends Exception{

    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public static double getRemainingAmount(double remainingAmount){
        return remainingAmount;
    }
}
