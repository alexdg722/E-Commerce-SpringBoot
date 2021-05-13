package net.dg.service;

import net.dg.model.*;
import net.dg.model.User;

import java.math.BigDecimal;
import java.util.Map;


public interface CartService {
    void addProductToCart(User user, Long productId) throws Exception;
    void removeProductFromCart(User user, Long productId);
    Map<Product, Integer> getAllProductsInCart(User user);
    BigDecimal getTotal(Map<Product, Integer> productsWithNeededQuantity);
    void clearProductsFromCart(User user);
    void updateNeededQuantity(User user, Long productId, Integer neededQuantity);
}
