package com.mystore;

import java.math.BigDecimal;


public class Dvd extends Product
{
   String duration;

   public Dvd()
   {
   }

   public Dvd(String duration, Person person, String sku, String title, BigDecimal price, Store[] store)
   {
      super(sku, title, price, store, person);
      this.duration = duration;
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
      return super.getPerson();
   }



   @Override
   public String toString()
   {
      return "Dvd [duration=" + duration + ", producer=" + super.getPerson() + ", price=" + getPrice() + "]";
   }

   @Override
   public BigDecimal getPrice()
   {
      // TODO Auto-generated method stub
      return new BigDecimal(super.getPrice().intValue() - 2);
   }


}
