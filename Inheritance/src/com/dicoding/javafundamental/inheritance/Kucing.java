package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan{
  public Kucing(){
    super();//akan tetap memanggil contructor dari parent Class
    System.out.println("construct Kucing");
  }
}
