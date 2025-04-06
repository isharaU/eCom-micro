package lk.cse.ishara.order_service.service;

import lk.cse.ishara.order_service.dto.OrderLineItemsDto;
import lk.cse.ishara.order_service.dto.OrderRequest;
import lk.cse.ishara.order_service.model.Order;
import lk.cse.ishara.order_service.model.OrderLineItems;

import java.util.List;
import java.util.UUID;

public class OrderService {
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDto()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderLineItemsList(orderLineItems);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }

}
