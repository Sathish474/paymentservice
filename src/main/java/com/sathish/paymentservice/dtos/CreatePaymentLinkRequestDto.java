package com.sathish.paymentservice.dtos;


public class CreatePaymentLinkRequestDto {
    private long orderId;
    // other fields

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}