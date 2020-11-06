package com.mystore;

import java.math.BigDecimal;

public class Dvd extends Product
{
   String duration;
   String producer;
   
   public Dvd()
   {
   }
   
   public Dvd(String duration, String producer, String sku, String title, BigDecimal price, Store[] store)
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

   public String getProducer()
   {
      return producer;
   }

   public void setProducer(String producer)
   {
      this.producer = producer;
   }
   
   
}
