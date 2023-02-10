package com.aycelik.designpatterns.chainOfResponsibility;

import org.junit.Test;

public class BasketHandlerTest {
    @Test
    public void whenSetValidValues_chainWillBeSuccess(){
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
    public void whenSetInvalidProductId_chainWillBeFailed(){
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
    public void whenSetInvalidProductName_chainWillBeFailed(){
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
    public void whenSetInvalidMerchant_chainWillBeFailed(){
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
    public void whenSetInvalidQuantity_chainWillBeFailed(){
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
    public void whenSetInvalidPrice_chainWillBeFailed(){
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
