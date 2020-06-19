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
class Pd{
    public int rev(int num, int temp){
        if (num==0)
        { return temp;}
        temp=(temp*10)+(num%10);
        return rev(num/10,temp);
    }
}
public class Plaindrome {
     public static void main(String[] args){
            int num,temp;
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter the no to check wheter it is plaindrome or not ");
            num=sc.nextInt();
         Pd p1=new Pd();
        temp= p1.rev(num, 0);
         if(temp==num)
         { System.out.println(+num+" is a plaindrome  number");}
         else 
         { System.out.println(+num+"  is not a plaindrome number");}
}
}
