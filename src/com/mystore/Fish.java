package com.mystore;

import java.math.BigDecimal;

public class Fish extends Product
{
   private Double weight;
   private String description;
   private Boolean status;
   
   public Fish()
   {
      super();
   }
   
   public Fish(Double weight, String description, Boolean status, String sku, String title, BigDecimal price, Store[] store)
   {
      super(sku, title, price, store);
      this.weight = weight;
      this.description = description;
      this.status = status;
   }

   public Double getWeight()
   {
      return weight;
   }

   public void setWeight(Double weight)
   {
      this.weight = weight;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public Boolean getStatus()
   {
      return status;
   }

   public void setStatus(Boolean status)
   {
      this.status = status;
   }

   @Override
   public String toString()
   {
      return "Fish [weight=" + weight + ", description=" + description + ", status=" + status + "]";
   }
   
   
   
   
}
