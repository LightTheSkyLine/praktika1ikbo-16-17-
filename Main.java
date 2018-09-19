package com.company;

public class Main {

    public static void main(String[] args) {
	Ball b1 = new Ball("Red", 10);
	Ball b2 = new Ball( "Blue");
	b2.setRadius(66);
	System.out.println("Color is " +  b1.getColor() + ", radius is " + b1.getRadius());
	System.out.println("Color is " +  b2.getColor() + ", radius is " + b2.getRadius());
	Book b10 = new Book("Good of War", 228);
	Book b20 = new Book("Perfect World", 322);
	System.out.println("Name is "+ b10.getName()+", number of page "+ b10.getNoP());
	System.out.println("Name is "+ b20.getName()+", number of page "+ b20.getNoP());
    }
}
