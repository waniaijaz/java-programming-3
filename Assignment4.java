package assignment4;
import java.util.Scanner;
class Area{
    double are;
    public void setDim(double l,double b){
       are=l*b;
    
    }
    public void getArea(){
        System.out.println("The area of rectangle is : "+are);
    }
   
}
public class Assignment4 {

   
    public static void main(String[] args) {
        double length,breadth;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of rectangle ");
        length=sc.nextDouble();
          System.out.println("enter the breadth of rectangle ");
        breadth=sc.nextDouble();
        Area a1=new Area();
        a1.setDim(length, breadth);
        a1.getArea();
        
        
    }
}
