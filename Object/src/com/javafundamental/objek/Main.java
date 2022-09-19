package com.javafundamental.objek;

public class Main {
  public static void main(String[] args){
  Hewan Elang = new Hewan("ELang");
  Hewan Kucing =  new Hewan("Kucing");

  Elang.beratHewan(5);
  Elang.jumlahKakiHewan(2);
  Elang.cetakHewan();

  Kucing.beratHewan(2);
  Kucing.jumlahKakiHewan(4);
  Kucing.cetakHewan();
  }

}

//  menciptakan object dengan nama 'objectHewan'
//  Hewan objekHewan = new Hewan();
//  objekHewan.cetakNama("Elang");