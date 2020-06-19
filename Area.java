/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
class Circle{
     private double radius;
  private String color= "red";
  Circle(){
      
  }
    Circle(double radius, String color){
      this.radius=radius;
      this.color=color;
     
  } 
   public double getRadius(double radius){
    //   System.out.println("the radius of circle is " +radius);
   this.radius=radius;
    return radius;
   }
  
  public double getArea(){
    //  System.out.println("the area of circle is :" +(3.14*radius*radius));
    double areaofcircle=((22/7)*radius*radius);
    return areaofcircle;
  }
}
public class Area {
        public static void main(String[] args ){
        
        Circle c1=new Circle();
       System.out.println(c1.getRadius(0));
        System.out.println(c1.getArea());
           System.out.println(c1.getRadius(50.22));
         System.out.println(c1.getArea());
    }

}
