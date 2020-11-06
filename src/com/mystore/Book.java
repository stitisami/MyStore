package com.mystore;

import java.math.BigDecimal;


public class Book extends Product
{
   private String isbn;
   private Integer numberPage;
   private Person person;


   public Book() {
      super();
   }
   
   public Book(String isbn, Integer numberPage, Person person, String sku, String title, BigDecimal price, Store[] store)
   {
      super(sku, title, price, store);
      this.isbn = isbn;
      this.numberPage = numberPage;
      this.person = person;

      person.setProduct(this);
   }


   public String getIsbn()
   {
      return isbn;
   }

   public void setIsbn(String isbn)
   {
      this.isbn = isbn;
   }

   public Integer getNumberPage()
   {
      return numberPage;
   }

   public void setNumberPage(Integer numberPage)
   {
      this.numberPage = numberPage;
   }

   public Person getAuthor()
   {
      return person;
   }

   public Person getPerson()
   {
      return person;
   }


   public void setPerson(Person person)
   {
      this.person = person;
   }


   @Override
   public String toString()
   {
      return "Book [isbn=" + isbn + ", numberPage=" + numberPage + ", author=" + getAuthor() + ", price=" + super.getPrice()
            + "]";
   }



}
