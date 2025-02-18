
package com.mycompany.mavenproject10;

public class Mavenproject10 {

    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setRadius(19);
        System.out.println("Radius:" + c1.getRadius());
        c1.setColor("Red");
        System.out.println("Color:" + c1.getColor());
        
        Circle c2 = new Circle();
        c2.setRadius(20);
        System.out.println("Radius:" + c2.getRadius());
        c2.setColor("Green");
        System.out.println("Color:" + c2.getColor());
        
        Circle c3 = new Circle();
        c3.setRadius(21);
        System.out.println("Radius:" + c3.getRadius());
        c3.setColor("Blue");
        System.out.println("Color:" + c3.getColor());
        
        Circle c4 = new Circle();
        c4.setRadius(22);
        System.out.println("Radius:" + c4.getRadius());
        c4.setColor("Black");
        System.out.println("Color:" + c4.getColor());
        
        Circle c5 = new Circle();
        c5.setRadius(23);
        System.out.println("Radius:" + c5.getRadius());
        c5.setColor("Yellow");
        System.out.println("Color:" + c5.getColor());
    }
}
