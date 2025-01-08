package com.sathish.paymentservice.controllers;

import com.sathish.paymentservice.dtos.CreatePaymentLinkRequestDto;
import com.sathish.paymentservice.dtos.CreatePaymentLinkResponseDto;
import com.sathish.paymentservice.services.PaymentService;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public CreatePaymentLinkResponseDto createPaymentLink(@RequestBody CreatePaymentLinkRequestDto requestDto) throws StripeException {
        CreatePaymentLinkResponseDto createPaymentLinkResponseDto = new CreatePaymentLinkResponseDto();
        String paymentLink = paymentService.createPaymentLink(requestDto.getOrderId());
        createPaymentLinkResponseDto.setPaymentLink(paymentLink);
        return createPaymentLinkResponseDto;
    }
}
