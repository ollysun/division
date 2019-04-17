package com.division;

public class Main {

    public static void divide(int x, int y) {
        // initialize dividend and divisor
        int dividend = x;
        int divisor = y;
        // check for negative dividend
        if(dividend < 0) {
            // convert it to positive value
            dividend = dividend * -1;
        }
        // check for negative divisor
        if(divisor < 0) {
            // convert it to positive value
            divisor = divisor * -1;
        }
        // initialize quotient
        int quotient = 0;
        //loop till the divisor does not become smaller than dividend
        while(dividend >= divisor)
        {
            dividend = dividend - divisor;
            quotient++;
        }
        // print results
        System.out.println("Quotient is "+quotient);
        // result of last subtraction
        System.out.println("Remainder is "+dividend);
    }

    public static void main(String[] args) {
        divide(22, 7);
    }
}
