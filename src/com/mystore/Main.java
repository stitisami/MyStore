package com.mystore;

import java.math.BigDecimal;

public class Main
{

   public static void main(String[] args)
   {
      Store[] store = new Store[1];
      store[0] = new Store("Founa", "rue de l'or 2030 bhar lazreg");
  

      Book book  = new Book("9789462447752", 250, "Foulen ben foulen", "A560", "LES PETITES MAINS TRUCK", new BigDecimal("15.250"), store);
      Dvd dvd  = new Dvd("1h25", "Min-ho Woo", "D1570", "L'Homme du Président", new BigDecimal("20"), store);

  
      System.out.println("Test get Author for Book");
      System.out.println(book.getAuthor());
      
      System.out.println("---------------------");
      
      System.out.println("Test toString Book");
      System.out.println(book);
      
      System.out.println("---------------------");
      
      System.out.println("Test get Producer for Dvd");
      System.out.println(dvd.getProducer());
      
      System.out.println("---------------------");
      
      System.out.println("Test toString Dvd");


      System.out.println(book);
      System.out.println(dvd);
      
     
   }

}
