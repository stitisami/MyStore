package com.mystore;

import java.math.BigDecimal;
import java.util.Arrays;


public class Product implements Discount
{
   private String sku;
   private String title;
   private BigDecimal price;
   private Store[] store;

   public Product()
   {

   }

   public Product(String sku, String title, BigDecimal price, Store[] store)
   {
      
      this.sku = sku;
      this.title = title;
      this.price = price;
      this.store = store;



      //System.out.println("**********");
   }

   public void init()
   {
      // logic..
   }


   public String getSku()
   {
      return sku;
   }

   public void setSku(String sku)
   {
      this.sku = sku;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public BigDecimal getPrice()
   {
      return price;
   }

   public void setPrice(BigDecimal price)
   {
      this.price = price;
   }

   public Store[] getStore()
   {
      return store;
   }

   public void setStore(Store[] store)
   {
      this.store = store;
   }

   @Override
   public String toString()
   {
      return "Product [sku=" + sku + ", title=" + title + ", price=" + price + ", store=" + Arrays.toString(store) + "]";
   }

   @Override
   public void applyDiscount(Integer discountValue, String discountType)
   {
      Integer newPrice = 0;

      BigDecimal discountValueBigDecimal = new BigDecimal(discountValue);

      if (discountType == "")
      {
         newPrice = price.intValue() - discountValueBigDecimal.intValue();
      }
      else
      {
         newPrice = price.intValue() - ((price.intValue() * discountValueBigDecimal.intValue()) / 100);
      }
      price = new BigDecimal(newPrice);
   }


}
