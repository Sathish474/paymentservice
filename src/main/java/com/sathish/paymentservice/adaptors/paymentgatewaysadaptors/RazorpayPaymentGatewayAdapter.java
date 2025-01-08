package com.sathish.paymentservice.adaptors.paymentgatewaysadaptors;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RazorpayPaymentGatewayAdapter implements PaymentGatewayAdaptor {
    @Override
    public String createPaymentLink(Long orderId) {
        return "https://razorpay.com/payment-link/" + orderId;
    }
}
