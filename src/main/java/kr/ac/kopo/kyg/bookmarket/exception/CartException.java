package kr.ac.kopo.kyg.bookmarket.exception;

public class CartException extends RuntimeException {
    private String cartId;
    public CartException(String CartId) {
        this.cartId = CartId;
    }
    public String getCartId() {
        return cartId;
    }
}
