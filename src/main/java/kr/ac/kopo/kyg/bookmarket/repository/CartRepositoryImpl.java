package kr.ac.kopo.kyg.bookmarket.repository;

import kr.ac.kopo.kyg.bookmarket.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements CartRepository {
    private Map<String, Cart> listOfCarts;

    public CartRepositoryImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }


    @Override
    public Cart create(Cart cart) {
        if(listOfCarts.containsKey(cart.getCartId())){
            throw new IllegalArgumentException("장바구니를 새로 생성할 수 없습니다. 장바구니 ID "+cart.getCartId()+"가 이미 존재합니다.");
        }
        listOfCarts.put(cart.getCartId(), cart);
        return cart;
    }

    @Override
    public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        if(!listOfCarts.containsKey(cartId)){
            throw  new IllegalArgumentException("장바구니 목록을 업데이트 할 수 없습니다. 장바구니가 존재하지 않습니다.");
        }
        listOfCarts.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        if (!listOfCarts.containsKey(cartId)) {
            throw new IllegalArgumentException("장바구니 목록을 업데이트 할 수 없습니다. 장바구니가 존재하지 않습니다.");
        }
        listOfCarts.remove(cartId);
    }
}
