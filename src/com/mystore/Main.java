package com.mystore;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main
{

   public static void main(String[] args)
   {
      Store[] store = new Store[1];
      store[0] = new Store("Founa", "rue de l'or 2030 bhar lazreg");

      Person author = new Person("Author", "ben Foulen", LocalDate.now());
      Person producer = new Person("Producer", "ben Foulen", LocalDate.now());
      
      Book book = new Book("9789462447752", 250, author, "A560", "LES PETITES MAINS TRUCK", new BigDecimal("15.250"),
            store);
      Dvd dvd = new Dvd("1h25", producer, "D1570", "L'Homme du Président", new BigDecimal("20"), store);


      System.out.println(book);
      System.out.println(book.getAuthor().getName());

      System.out.println("---------------------");

      System.out.println(dvd);
      System.out.println(dvd.getProducer().getName());


   }

}
