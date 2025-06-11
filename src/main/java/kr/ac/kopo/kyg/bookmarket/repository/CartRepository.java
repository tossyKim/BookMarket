package kr.ac.kopo.kyg.bookmarket.repository;

import kr.ac.kopo.kyg.bookmarket.domain.Cart;

public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
}
