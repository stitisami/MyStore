package com.mystore;

import java.math.BigDecimal;


public class Dvd extends Product
{
   String duration;
   Person producer;

   public Dvd()
   {
   }

   public Dvd(String duration, Person producer, String sku, String title, BigDecimal price, Store[] store)
   {
      super(sku, title, price, store);
      this.duration = duration;
      this.producer = producer;
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
      return producer;
   }

   public void setProducer(Person producer)
   {
      this.producer = producer;
   }



   @Override
   public String toString()
   {
      return "Dvd [duration=" + duration + ", producer=" + producer + ", price=" + getPrice() + "]";
   }

   @Override
   public BigDecimal getPrice()
   {
      // TODO Auto-generated method stub
      return new BigDecimal(super.getPrice().intValue() - 2);
   }


}
