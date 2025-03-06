package com.senai.ecommerce.service;

import com.senai.ecommerce.entities.Payment;
import org.springframework.stereotype.Service;
import com.senai.ecommerce.dtos.PaymentDTO;
import com.senai.ecommerce.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentDTO findById(Long id) {
        Payment payment = paymentRepository.findById(id).orElseThrow();
        return paymentToPaymentDTO(payment);
    }

    private PaymentDTO paymentToPaymentDTO(Payment payment) {
        return new PaymentDTO(payment.getId(), payment.getMoment());
    }
}
