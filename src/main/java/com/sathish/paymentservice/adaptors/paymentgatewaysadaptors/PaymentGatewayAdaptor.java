package com.sathish.paymentservice.adaptors.paymentgatewaysadaptors;

import com.stripe.exception.StripeException;

public interface PaymentGatewayAdaptor {
    String createPaymentLink(Long orderId) throws StripeException;
}
