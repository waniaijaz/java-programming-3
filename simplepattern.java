/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author AIJAZ
 */
class pattern{
     public int inverted(int n,int k){
        
         if(n>=-10){
                 if(n<0)
             { System.out.println(-n); }
            // return inverted(num-1);
            else
                 { System.out.println(n);}
         
              inverted(n-2,k);
              
         } 
//         else if( inverted(num-1)>=-1)
//               System.out.println(num);
//         
//         
         return 0;
         
}
}
public class simplepattern {
      public static void main(String[] args){
        pattern p1=new pattern();
       int x=  p1.inverted(10,2);
         
     }  
}
