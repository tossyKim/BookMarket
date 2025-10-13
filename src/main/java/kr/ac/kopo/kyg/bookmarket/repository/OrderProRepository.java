package kr.ac.kopo.kyg.bookmarket.repository;

import kr.ac.kopo.kyg.bookmarket.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProRepository extends JpaRepository<Order, Long> {
}
