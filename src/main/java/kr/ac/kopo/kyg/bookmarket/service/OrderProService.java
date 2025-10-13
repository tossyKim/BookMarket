package kr.ac.kopo.kyg.bookmarket.service;

import kr.ac.kopo.kyg.bookmarket.domain.Order;
import kr.ac.kopo.kyg.bookmarket.repository.OrderProRepository;
import kr.ac.kopo.kyg.bookmarket.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProService {

    @Autowired
    private OrderProRepository orderProRepository;

    public void save(Order order){
        orderProRepository.save(order);
    }
}
