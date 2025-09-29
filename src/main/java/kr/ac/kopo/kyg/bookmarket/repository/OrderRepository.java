package kr.ac.kopo.kyg.bookmarket.repository;


import kr.ac.kopo.kyg.bookmarket.domain.Order;

public interface OrderRepository {
    Long saveOrder(Order order);
}
