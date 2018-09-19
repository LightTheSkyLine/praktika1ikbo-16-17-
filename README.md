# praktika1ikbo-16-17-
Сторожук Даниил Сергеевич ИКБО-16-17
package com.company;

public class Book {
    private String name;
    private int NoP;
    public Book(String n,int nop){
        name = n;
        NoP = nop;
    }
    public Book(String n){
        name = n;
    }
    public Book(){
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNoP(int NoP){
        this.NoP = NoP;
    }
    public String getName(){
        return name;
    }
    public int getNoP(){
        return NoP;
    }

}

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

package com.company;

public class Ball {
    private String color;
    private int  radius;
    public Ball(String c, int r){
        color = c;
        radius = r;
    }
    public Ball(String c){
        color = c;
    }
    public Ball(){
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
}



