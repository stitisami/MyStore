package com.mystore;

import java.math.BigDecimal;


public class Book extends Product
{
   private String isbn;
   private Integer numberPage;
   private Person author;



   public Book(String isbn, Integer numberPage, Person author, String sku, String title, BigDecimal price, Store[] store)
   {
      super(sku, title, price, store);
      this.isbn = isbn;
      this.numberPage = numberPage;
      this.author = author;
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
      return author;
   }

   public void setAuthor(Person author)
   {
      this.author = author;
   }





   @Override
   public String toString()
   {
      return "Book [isbn=" + isbn + ", numberPage=" + numberPage + ", author=" + author + ", price=" + super.getPrice() + "]";
   }


   @Override
   public BigDecimal getPrice()
   {
      return new BigDecimal("10");
   }


}
