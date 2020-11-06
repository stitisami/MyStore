package com.mystore;

import java.math.BigDecimal;


public class Dvd extends Product
{
   String duration;
   private Person person;

   public Dvd()
   {
      super();
   }

   public Dvd(String duration, Person person, String sku, String title, BigDecimal price, Store[] store)
   {
      //super(sku, title, price, store);
      super.setSku(sku);
      super.setTitle(title);
      super.setPrice(price);
      super.setStore(store);
      
      this.duration = duration;
      this.person = person;

      person.setProduct(this);
   }

   public String getDuration()
   {
      return duration;
   }

   public void setDuration(String duration)
   {
      this.duration = duration;
   }



   public Person getProducer()
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
      return "Dvd [duration=" + duration + ", producer=" + getProducer() + ", price=" + getPrice() + "]";
   }


}
