package com.pluralsight;

public class Array {
    public static void main(String[] args) {
        int firstNumber = 1;
        int[] newArrayOfNumbers = new int [5];
        int [] listOfNumbers = {55,67,123,567,12,32,19};

        for (int i = 0; i < newArrayOfNumbers.length; i++){
            System.out.println(listOfNumbers[i] + "");
        }
    }
}
