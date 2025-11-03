package kr.ac.kopo.kyg.bookmarket.repository;


import kr.ac.kopo.kyg.bookmarket.domain.Order;

public interface OrderRepository {
    //    주문목록 저장
    Long saveOrder(Order order);
}
