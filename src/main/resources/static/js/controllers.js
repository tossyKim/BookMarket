function addToCart(bookId){
    if(confirm("장바구니에 도서를 추가할까요?")){
        document.addForm.action = "/BookMarket/cart/book"+ bookId;
        document.addForm.submit();
    }
}

function removeFromCart(bookId, cartId){
    document.romoveForm.action = "/BookMarket/cart/book"+ bookId;
    document.romoveForm.submit();
    setTimeout('location.reload()',10);
}