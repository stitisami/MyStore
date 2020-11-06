package com.mystore;

import java.math.BigDecimal;

public class Main
{

   public static void main(String[] args)
   {
      Store[] store = new Store[1];
      store[0] = new Store("Founa", "rue de l'or 2030 bhar lazreg");
      
      Product product = new Product("P2040", "Eau marwa", new BigDecimal("2.300"), store);

      System.out.println(product);
      System.out.println(store[0]);
   }

}
