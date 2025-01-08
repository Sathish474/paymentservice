package com.sathish.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;


public class CreatePaymentLinkResponseDto {
    private String paymentLink;

    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }
}
