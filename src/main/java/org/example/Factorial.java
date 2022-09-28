package org.example;

public class Factorial {
    public static void main(String[] args) {
         factorialOfNumber(9);
         factorialOfNumberWithWhile(9);
    }


    static int factorialOfNumber(int zahl) {
        int factorial = 1;
        for (int i = 1; i <= zahl; i++) {
            System.out.println("i " + i);
            factorial = factorial * i;
            System.out.println("fact:" + factorial);
        }
        System.out.println("factorial of: " + zahl + " = " + factorial);
        return factorial;
    }

    static int factorialOfNumberWithWhile(int number){
        int factorial = 1;
        int count=1;
        while(count <= number){
            factorial = factorial * count;
            count++;
        }
        System.out.println("factorial of: "+ number + " = " + factorial);
        return factorial;
    }

}
