package com;

public class Pallindrome {
    public static void main(String[] args) {

        String originalStr = "ABkA";

        String rev="";

        for (int i = originalStr.length()-1;i>=0;i--)
        {

            rev = rev+originalStr.charAt(i);
        }

        System.out.println(rev);
        if (originalStr.equals(rev))
        {
            System.out.println("both are equals");
        }
        else {
            System.out.println("NO");
        }
        int number = 1221;
        int originalNUmber = number;

        int revNumber = 0;
        while(number>0)
        {
            revNumber = revNumber*10 +number%10;
            number = number/10;
        }
        System.out.println(revNumber);
        if(originalNUmber == revNumber)
        {
            System.out.println("both numbers are equal");
        }
        else {
            System.out.println("nah");
        }
        int number1 = 12443244;
        int count=0;
        while(number1>0)
        {
            number1=number1/10;
            count++;
        }
        System.out.println(count);
    }
}
