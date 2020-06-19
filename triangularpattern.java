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
class pattern{
     public int inverted(int num){
        
         if(num>=-5){
                 if(num<0)
             { System.out.println(-num); }
            // return inverted(num-1);
            else
                 { System.out.println(num);}
         
              inverted(num-1);
              
         } 
//         else if( inverted(num-1)>=-1)
//               System.out.println(num);
//         
//         
         return 0;
         
}
}
public class triangularpattern {
    
     public static void main(String[] args){
        pattern p1=new pattern();
       int x=  p1.inverted(5);
          // System.out.println("the inverted pattern is "+x);
     }  
}
