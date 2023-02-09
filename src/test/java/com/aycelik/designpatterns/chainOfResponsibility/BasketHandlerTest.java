package com.aycelik.designpatterns.chainOfResponsibility;

import org.junit.Test;

public class BasketHandlerTest {

    @Test
    public void testSuccessChain(){

        Product product = new Product("1", "product1", "merchant1", 1, 2);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }

    @Test
    public void testFailChain_Scenario1(){

        Product product = new Product("", "product1", "merchant1", 1, 2);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }

    @Test
    public void testFailChain_Scenario2(){

        Product product = new Product("1", "", "merchant1", 1, 2);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }

    @Test
    public void testFailChain_Scenario3(){

        Product product = new Product("1", "product1", "", 1, 2);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }
    @Test
    public void testFailChain_Scenario4(){

        Product product = new Product("1", "product1", "merchant1", 15, 2);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }

    @Test
    public void testFailChain_Scenario5(){

        Product product = new Product("1", "product1", "merchant1", 1, -1);
        BasketHandler productHandler = new ProductFilter();
        BasketHandler priceHandler = new PriceFilter();
        BasketHandler quantityHandler = new QuantityFilter();
        BasketHandler merchantHandler = new MerchantFilter();

        productHandler
                .setNextHandler(priceHandler)
                .setNextHandler(quantityHandler)
                .setNextHandler(merchantHandler);

        productHandler.handle(product);
    }

}
