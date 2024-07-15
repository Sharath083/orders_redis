package com.task.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderData{
    private String productId;
    private String productName;
    private int quantity;
}
