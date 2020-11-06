package com.mystore;

import java.math.BigDecimal;

/**
 * This interface was created to make promotions on any type of product
 * @author Nexus2i Teams
 * @version 1.0
 */

public interface Discount
{
   /**
    * This method aims to minimize the price of an item
    * We call this method when we need a discount on the price of an item
    * @param discountValue : if discountType is percentage, pass the percentage value, if discountType is null we pass the price of the discount
    * @param discountType : can be a percentage % or empty
    */
   public void applyDiscount(Integer discountValue, String discountType);
}
