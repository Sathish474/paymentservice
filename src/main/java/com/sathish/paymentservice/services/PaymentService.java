package com.sathish.paymentservice.services;

import com.sathish.paymentservice.adaptors.paymentgatewaysadaptors.PaymentGatewayAdaptor;
import com.sathish.paymentservice.factory.PaymentGatewayFactory;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGatewayFactory paymentGatewayFactory;

    public PaymentService(PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentGatewayFactory = paymentGatewayFactory;
    }

    public String createPaymentLink(Long orderId) throws StripeException {
        // Get the order details from order service
        // RestTemplate.getForObject("http://localhost:8081/orders/" + orderId, String.class);
        Long price = 123L;
        // Get a payment gateway based on a strategy pattern
        PaymentGatewayAdaptor paymentGatewayAdaptor = paymentGatewayFactory.getPaymentGatewayAdaptor("stripe");
        // Call the payment gateway to create a link
        // return the link
        return paymentGatewayAdaptor.createPaymentLink(orderId);
    }
}
