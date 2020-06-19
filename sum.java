/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author AIJAZ
 */
public class sum {
    public static void main(String[] args){
    System.out.println("aijaz ah,ad wani");
    int total=0, n,rem,temp;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter any  no. ");
    n=sc.nextInt();
    temp=n;
    while(temp!=0){
        rem=temp%10;
        total=total+rem;
        temp=temp/10;
    }
    System.out.println("the sum of digits of " +n+ "is " +total);
    
}
}
