/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.Scanner;

public class COMPLEXNO {
    
      //for real and imaginary parts of complex numbers
   double real, img;
	
   //constructor to initialize the complex number
  COMPLEXNO (double r, double i){
	this.real = r;
	this.img = i;
   }
   public  static COMPLEXNO sum(COMPLEXNO c1, COMPLEXNO c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        COMPLEXNO temp = new COMPLEXNO(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
   }
    
    public  static COMPLEXNO difference(COMPLEXNO c1, COMPLEXNO c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        COMPLEXNO temp = new COMPLEXNO(0, 0);

        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        
        //returning the output complex number
        return temp;
   }
         public  static COMPLEXNO product(COMPLEXNO c1, COMPLEXNO c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        COMPLEXNO temp = new COMPLEXNO(0, 0);

        temp.real = c1.real * c2.real;
        temp.img = c1.img * c2.img;
        
        //returning the output complex number
        return temp;
   }
   
           
    public static void main(String[] args ){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the real  ist complex no.");
        double no1=sc.nextDouble();
           System.out.println("enter the img part ist complex no.");
        double no2=sc.nextDouble();
         COMPLEXNO c1 = new COMPLEXNO(no1, no2);
             System.out.println("enter the real  2nd complex no.");
         no1=sc.nextDouble();
           System.out.println("enter the img part 2nd complex no.");
         no2=sc.nextDouble();
	COMPLEXNO c2 = new COMPLEXNO(no1, no2);
   
        
        COMPLEXNO temp = sum(c1, c2);
        System.out.println("Sum of two complex nos is: "+ temp.real+" + "+ temp.img +"i");
         temp = difference(c1, c2);
       System.out.println("difference of two complex nos  is: "+ temp.real+" + "+ temp.img +"i");
      
       temp = product(c1, c2);
    
       System.out.println("product  of two complex nos  is: "+ temp.real+" - "+temp.img +"i");
    }
}
