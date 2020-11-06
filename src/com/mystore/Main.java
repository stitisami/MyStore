package com.mystore;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Iterator;


public class Main
{

   public static void main(String[] args)
   {
      Store[] store = new Store[1];
      store[0] = new Store("Founa", "rue de l'or 2030 bhar lazreg");

      Person author = new Person("Author", "ben Foulen", LocalDate.now());
      Person author2 = new Person("Author2", "ben Foulen", LocalDate.now());
      Person producer = new Person("Producer", "ben Foulen", LocalDate.now());

      Book book1 = new Book("9789462447752", 150, author, "A560", "To Kill a Mockingbird, by Harper Lee", new BigDecimal("33.560"), store);
      Book book2 = new Book("1289462447756", 123, author, "B785", "1984, by George Orwell", new BigDecimal("25.160"), store);
      Book book3 = new Book("0089462447788", 860, author2, "C899", "Harry Potter and the Philosopher's Stone, by J.K. Rowling", new BigDecimal("70.150"), store);
      Book book4 = new Book("1189462447750", 950, author2, "E820", "The Lord of the Rings, by J.R.R", new BigDecimal("3.100"), store);
      Book book5 = new Book("8889462447759", 121, author, "D002", "Pride and Prejudice, by Jane Austen", new BigDecimal("10.000"), store);
     
      //System.out.println(book1);
      
    

      Dvd dvd1 = new Dvd("1h25", producer, "D1570", "L'Homme du Président", new BigDecimal("20"), store);
      Dvd dvd2 = new Dvd("1h25", producer, "D1570", "L'Homme du Président", new BigDecimal("20"), store);


      //System.out.println( author.getProducts());
      //System.out.println( producer.getProducts());
      
      for (Iterator iterator = author.getProducts().iterator(); iterator.hasNext();)
      {
         System.out.println(iterator.next());

      }
    System.out.println("-----------------------");
      
      
      for (Iterator iterator = author2.getProducts().iterator(); iterator.hasNext();)
      {
         System.out.println(iterator.next());

      }
      
     //System.out.println(producer.getProducts());


   }

}
