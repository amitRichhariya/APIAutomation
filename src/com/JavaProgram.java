package com;

import java.util.Scanner;

public class JavaProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number =  sc.nextInt();

       int rev =0;
       /* while(number!=0)
        {

            rev = rev*10 + number%10;
            number= number/10;
        }
        System.out.println(rev);*/
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.reverse();
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        System.out.println(stringBuffer.reverse());


    }
}
