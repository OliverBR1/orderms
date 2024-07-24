package com.btgpactual.orderms.controller.dto;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import com.btgpactual.orderms.factory.OrderEntityFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderResponseTest {

    @Nested
    class FromEntity {

        @Test
        void shouldMapCorrectly() {
            // ARRANGE
            var input = OrderEntityFactory.build();

            // ACT
            var output = OrderResponse.fromEntity(input);

            // ASSERT
            assertEquals(input.getOrderId(), output.orderId());
            assertEquals(input.getCustomerId(), output.customerId());
            assertEquals(input.getTotal(), output.total());
        }
    }

}