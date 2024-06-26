package com.sherry.service;

import com.sherry.exception.CartItemException;
import com.sherry.exception.UserException;
import com.sherry.model.Cart;
import com.sherry.model.CartItem;
import com.sherry.model.Product;
import com.sherry.request.UpdateItemRequest;

public interface CartItemService {
    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId, Long id, UpdateItemRequest req)throws CartItemException, UserException;

    public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);
    public void removeCartItem(Long userId, Long cartItemId)throws CartItemException, UserException;

    public CartItem findCartItemById(Long cartItemId)throws CartItemException;
}
