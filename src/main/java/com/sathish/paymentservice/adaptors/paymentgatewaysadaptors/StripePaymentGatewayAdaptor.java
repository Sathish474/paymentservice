package com.sathish.paymentservice.adaptors.paymentgatewaysadaptors;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.param.PaymentLinkCreateParams;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentGatewayAdaptor implements PaymentGatewayAdaptor {
    @Override
    public String createPaymentLink(Long orderId) throws StripeException {
        // Set your secret key: remember to set this from environment variables
        Stripe.apiKey = "sk_test_51Qf3NXJW73LMvVCJzLZt0k1rX2c5g4x7";

        PaymentLinkCreateParams params =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice("price_1Qf3OqJW73LMvVCJzLZt0k1rX")
                                        .setQuantity(1L)
                                        .build()
                        )
                        .build();

        PaymentLink paymentLink = PaymentLink.create(params);
        return paymentLink.getUrl();
    }
}
