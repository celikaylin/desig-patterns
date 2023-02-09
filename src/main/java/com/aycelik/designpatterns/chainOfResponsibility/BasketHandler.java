package com.aycelik.designpatterns.chainOfResponsibility;

public abstract class BasketHandler {
    protected BasketHandler _nextHandler = null;

    public BasketHandler setNextHandler(BasketHandler handler) {
        _nextHandler = handler;
        return _nextHandler;
    }

    public void handle(Product product) {
        if (_nextHandler != null) {
            _nextHandler.handle(product);
        }
    }
}

class ProductFilter extends BasketHandler {
    @Override
    public void handle(Product product) {
        if (product.id == null || product.id.isEmpty() || product.name == null || product.name.isEmpty()) {
            System.out.println("Product is invalid!");
        } else {
            if (_nextHandler != null) {
                _nextHandler.handle(product);
            }
        }
    }
}

class PriceFilter extends BasketHandler {
    @Override
    public void handle(Product product) {
        if (product.price < 0) {
            System.out.println("Price is invalid!");

        } else {
            if (_nextHandler != null) {
                _nextHandler.handle(product);
            }
        }
    }

}

class QuantityFilter extends BasketHandler {
    @Override
    public void handle(Product product) {
        if (product.quantity > 5) {
            System.out.println("Adding more than 5 same products at the same time is not allowed!");
        } else {
            if (_nextHandler != null) {
                _nextHandler.handle(product);
            }
        }
    }

}

class MerchantFilter extends BasketHandler {
    @Override
    public void handle(Product product) {
        if (product.merchant == null || product.merchant.isEmpty()) {
            System.out.println("Merchant is not valid!");
        } else {
            if (_nextHandler != null) {
                _nextHandler.handle(product);
            }
        }
    }
}

