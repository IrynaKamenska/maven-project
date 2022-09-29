package org.example;

public class Factorial {
    public static void main(String[] args) {
//         factorialOfNumber(9);
//         factorialOfNumberWithWhile(9);


        System.out.println(factorial(6));
//        int num = 6;
       /*long factorial = factorialOf(num);
        System.out.println("Factorial of "+ num + " is " + factorial);*/
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


    // factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n

    // 6 * 5 * 4 * 3 * 2 * 1 * 1 (for 0) = 720
    static long factorialOf(int number){
        if(number <= 0){
            return 1;
        } else {
            return number * factorialOf(number - 1);
        }
    }


    static int factorial(int i){
        int res = 1;
        for ( ; i >1 ; i--) {
            res *= i;
        }
        return res;
    }



}
