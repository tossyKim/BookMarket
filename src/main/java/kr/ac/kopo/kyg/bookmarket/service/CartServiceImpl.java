package kr.ac.kopo.kyg.bookmarket.service;

import kr.ac.kopo.kyg.bookmarket.domain.Cart;
import kr.ac.kopo.kyg.bookmarket.exception.CartException;
import kr.ac.kopo.kyg.bookmarket.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartRepository cartRepository;

    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }

    public Cart read(String cartId) {
        System.out.println("Cart read 테스트");
        return cartRepository.read(cartId);
    }

    public void update(String cartId, Cart cart) {
        System.out.println("Cart update 테스트");
        cartRepository.update(cartId, cart);
    }

    public void delete(String cartId) {
        cartRepository.delete(cartId);
    }

    @Override
    public Cart validateCart(String cartId) {
        Cart cart = cartRepository.read(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new CartException(cartId);
        }
        return cart;
    }
}
