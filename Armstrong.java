
package assignment4;

import java.util.Scanner;

/**
 *
 * @author AIJAZ153
 */
public class Armstrong {
   
      public static void main(String[] args){
        System.out.println("helloworld");
        int n, temp, num=0, rem;
        Scanner sc= new Scanner(System.in);
		
        System.out.println("Enter any Positive Number : ");
        n = sc.nextInt();
		
        temp = n;		
        while(temp != 0)
        {
            rem = temp%10;
            num = num + rem*rem*rem;
            temp = temp/10;
        }
        if(num == n)
        {
            System.out.println(+n+ "   is an Armstrong Number");
        }
        else
        {
            System.out.println(+n+ " is Not an Armstrong Number");
        }
    }
}