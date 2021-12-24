package com.company;

public class Main {
    static String name = "Rusiru sadeepa";
    public final static int serialNum= 10;
    public static void main(String[] args) {
        System.out.println("Hellow  world!");
        System.out.println("name:" + name);

        // casting variable
        int valA= 20, valB= 30, valC=40;
        int sumInt = valA + valB + valC;
        double sumDouble = (double)valA + (double) valB + (double) valC;
        System.out.println("sum int = "+sumInt);
        System.out.println("SumDouble= "+ sumDouble);

        double div = 3.5;
        int avgint = sumInt/(int) div;
        double avgintdouble = sumInt/div;
        double avgDouble = sumInt/ div;
        float a = (float) 2.5;
        System.out.println("avgint Double = "+ avgintdouble);
        System.out.println("avgInt = " + avgint);
        System.out.println("avg double = "+ avgDouble);

         // common operators
        int age = 18;
        if (age < 18 ) {
            System.out.println("Not eligible ");}
        else if (age <= 18){
            System.out.println("eligible ");}
            else {
                System.out.println("eligible ");}






    }
}
