package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ListPlanet {
  public static void main (String[] args) {
    //Deklarasi Array
    String[] heroes = new String[2];
    heroes[0] = "riki";
    heroes[1] = "sven";
    //heroes[2] = "zeus"; //Erorr ArrayIndexOutOfBoundException karena ukuran array tetap

    // menggunakan ArrayList
    List<String> planets = new ArrayList<>();
    planets.add("mercury"); //methode add() untuk menambah objek ke List
    planets.add("venus");
    planets.add("earth");
    planets.add("mars"); //objek lainnya masih bisa terus ditambahkan ke list

    System.out.println("List Planet Awal : ");
    for (int i = 0; i < planets.size(); i++) { //Method size() untuk mendapatkankan ukuran List
      //method get() untuk melihat isi list pada index i
      System.out.println("\t index-" + i + " = " + planets.get(i));
    }
    planets.remove("venus"); //method remove() untuk mengeluarkan objek dari List

    System.out.println("List Planet Akhir : ");
    for (int i = 0; i < planets.size(); i++) {
      System.out.println("\t index-" + i + " = " + planets.get(i));
    }
  }
}

