package com.mystore;

import java.math.BigDecimal;

public class Book extends Product
{
   private String isbn;
   private Integer numberPage;
   private String author;
   
   
   
   public Book(String isbn, Integer numberPage, String author, String sku, String title, BigDecimal price, Store[] store) {
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

   public String getAuthor()
   {
      return author;
   }

   public void setAuthor(String author)
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
