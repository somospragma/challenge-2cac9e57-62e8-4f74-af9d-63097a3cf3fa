package com.example.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    void testProcessPayment() {
        String paymentId = "12345";
        paymentService.processPayment(paymentId);
        // Agregar asserts para verificar el resultado
    }

    @Test
    void testProcessPaymentWithInvalidId() {
        String paymentId = "";
        paymentService.processPayment(paymentId);
        // Agregar asserts para verificar el manejo de errores
    }
}