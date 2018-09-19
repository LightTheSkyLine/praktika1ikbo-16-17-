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
