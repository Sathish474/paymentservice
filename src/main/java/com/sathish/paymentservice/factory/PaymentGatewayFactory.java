package com.sathish.paymentservice.factory;

import com.sathish.paymentservice.adaptors.paymentgatewaysadaptors.PaymentGatewayAdaptor;
import com.sathish.paymentservice.adaptors.paymentgatewaysadaptors.RazorpayPaymentGatewayAdapter;
import com.sathish.paymentservice.adaptors.paymentgatewaysadaptors.StripePaymentGatewayAdaptor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayFactory {
    private final PaymentGatewayAdaptor stripePaymentGatewayAdaptor;
    private final PaymentGatewayAdaptor razorPaymentGatewayAdaptor;

    public PaymentGatewayFactory(@Qualifier("stripePaymentGatewayAdaptor") PaymentGatewayAdaptor stripePaymentGatewayAdaptor, @Qualifier("razorpayPaymentGatewayAdapter") PaymentGatewayAdaptor razorPaymentGatewayAdaptor) {
        this.stripePaymentGatewayAdaptor = new StripePaymentGatewayAdaptor();
        this.razorPaymentGatewayAdaptor = new RazorpayPaymentGatewayAdapter();
    }

    public  PaymentGatewayAdaptor getPaymentGatewayAdaptor(String gatewayName) {
        if (gatewayName.equals("razorpay")) {
            return razorPaymentGatewayAdaptor;
        } else if (gatewayName.equals("stripe")) {
            return stripePaymentGatewayAdaptor;
        }
        return stripePaymentGatewayAdaptor;
    }
}
