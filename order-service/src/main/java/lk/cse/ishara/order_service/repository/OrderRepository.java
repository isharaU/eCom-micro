package lk.cse.ishara.order_service.repository;

import lk.cse.ishara.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
