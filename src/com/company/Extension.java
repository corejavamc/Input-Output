package com.company;

import java.util.Scanner;

/*Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results.
Output should look like this:
First Num
5
Second Num
4
Sum : 9
Product : 20

Write a program to find square of a number.

E.g.-
INPUT : 2        OUTPUT : 4
INPUT : 5        OUTPUT : 25

Take two different string input and print them in same line. E.g.-
INPUT : Code's
 Fun
OUTPUT : Code's Fun
*/
public class Extension {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Sum and Product of two integers
        System.out.print("Finding sum of two Integers\n Enter First Number: ");
        int firstNum=input.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum=input.nextInt();
        int sum=firstNum+secondNum;
        int product=firstNum*secondNum;
        System.out.println("Sum: "+sum+"\nProduct: "+product);
        //Squaring an input number
        System.out.println("Enter a number to find its squared value: ");
        int num1=input.nextInt();
        int square=num1*num1;
        System.out.println("Your squared value: "+square);
        //Combine words
        System.out.println("Enter first string to concatnate 1: ");
        String stringN=input.nextLine();
        System.out.print("2: ");
        String stringS= input.nextLine();
        String concat= stringN+stringS;
        System.out.println("Concat: "+concat);

    }
}
