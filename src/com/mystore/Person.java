package com.mystore;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class Person
{
   private String firstName;
   private String lastName;
   private LocalDate birthday;
   private LinkedList<Product> products;
   
   public Person()
   {
      
   }
   public Person(String firstName, String lastName, LocalDate birthday)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthday = birthday;

      this.products = new LinkedList<>();
   }

   public String getName()
   {
      return firstName + " " + lastName;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public LocalDate getBirthday()
   {
      return birthday;
   }

   public void setBirthday(LocalDate birthday)
   {
      this.birthday = birthday;
   }
   


   public LinkedList<Product> getProducts()
   {
      return products;
   }
   public void setProducts(LinkedList<Product> products)
   {
      this.products = products;
   }
   public void setProduct(Product product)
   {
      this.products.add(product);
   }
   
   
   @Override
   public String toString()
   {
      return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + "]";
   }
   
   
   
   /*public <T, E> String getProducts(){
      return "dddd";
      
   }*/
   



}
